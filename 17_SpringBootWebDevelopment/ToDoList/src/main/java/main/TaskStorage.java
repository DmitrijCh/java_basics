package main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

@Component
public class TaskStorage {
    private final int maxId = 0;
    private final List<Task> tasks = new ArrayList<>();

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



