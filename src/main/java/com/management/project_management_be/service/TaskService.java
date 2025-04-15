package com.management.project_management_be.service;

import com.management.project_management_be.model.Task;

import java.util.List;

public interface TaskService {
    List<Task> getAllTasks();
    Task createTask(Task task);
    Task updateTask(Task task);
    void deleteTask(Long taskId);
}
