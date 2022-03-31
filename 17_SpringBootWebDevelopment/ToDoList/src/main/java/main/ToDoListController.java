package main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ToDoListController {
    private final TaskStorage taskStorage;

    @Autowired
    public ToDoListController(TaskStorage taskStorage) {
        this.taskStorage = taskStorage;
    }


    @GetMapping("/tasks")
    public List<Task> listTasks() {
        return taskStorage.getTasks();
    }


    @PostMapping("/tasks")
    public int add(Task task) {

        Task newTask = taskStorage.addTask(task);
        return newTask.getId();
    }

    @DeleteMapping("/tasks{id}")
    public ResponseEntity deleteTask(@RequestParam int id) {
        return taskStorage.deleteTask(id);
    }

    @DeleteMapping("/tasks/")
    public void deleteAll() {
        taskStorage.deleteAll();
    }

}