package com.management.project_management_be.repository;

import com.management.project_management_be.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
