package Devtiro.Task.domain;

import java.time.LocalDate;

import Devtiro.Task.domain.entity.TaskPriority;

public record CreateTaskRequest(
        String title,
        String description,
        LocalDate dueDate,
        TaskPriority priority) {
}
