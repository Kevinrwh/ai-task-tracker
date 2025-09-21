package com.kevin.ai_task_tracker.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.http.HttpStatus;
import com.kevin.ai_task_tracker.model.Task;
import java.util.*;

@RestController
@RequestMapping("/tasks")
public class TaskController {
    private List<Task> tasks = new ArrayList<>();
    private long currentId = 1;

    @GetMapping
    public List<Task> getAllTasks() {
        return tasks;
    }

    @PostMapping
    public Task createTask(@RequestBody Task task) {
        task.setId(currentId++);
        tasks.add(task);
        return task;
    }

    @PutMapping("/{id}")
    public Task updateTask(@PathVariable Long id, @RequestBody Task updatedTask) {
        for (Task task : tasks) {
            if (task.getId().equals(id)) {
                task.setTitle(updatedTask.getTitle());
                task.setCompleted(updatedTask.isCompleted());
                return task;
            }
        }
        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Task not found");
    }

    @DeleteMapping("/{id}")
    public void deleteTask(@PathVariable Long id) {
        tasks.removeIf(task -> task.getId().equals(id));
    }
}
