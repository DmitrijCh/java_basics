package main;

import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.annotation.PostConstruct;

@Component
public class TaskStorage {
    private int maxId = 0;
    private List<Task> tasks = new ArrayList<>();

    @Autowired
    private final TaskRepository taskRepository;

    public TaskStorage(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public List<Task> getTasks() {
        Iterable<Task> taskIterable = taskRepository.findAll();
        ArrayList<Task> tasks = new ArrayList<>();
        for (Task task : taskIterable) {
            tasks.add(task);
        }
        return tasks;
    }

    public Task addTask(Task task) {
        return taskRepository.save(task);
    }

    public ResponseEntity deleteTask(@PathVariable int id) {

        if (!taskRepository.existsById(id)) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);

        }
        taskRepository.deleteById(id);
        return ResponseEntity.ok(id);
    }

    public void deleteAll() {
        taskRepository.deleteAll();
    }
}



