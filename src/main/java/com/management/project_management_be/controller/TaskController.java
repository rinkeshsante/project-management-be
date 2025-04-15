package com.management.project_management_be.controller;

import com.management.project_management_be.model.Task;
import com.management.project_management_be.service.TaskService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/task")
public class TaskController {
    private final TaskService taskService;

    public TaskController(TaskService taskService){
        this.taskService = taskService;
    }

    @GetMapping
    public List<Task> getAllTasks(){
        return taskService.getAllTasks();
    }

    @PostMapping
    public Task createProduct(@RequestBody Task task) {
        return taskService.createTask(task);
    }

    @PutMapping
    public Task updateProduct(@RequestBody Task task) {
        return taskService.updateTask(task);
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable Long id) {
        taskService.deleteTask(id);
    }
}
