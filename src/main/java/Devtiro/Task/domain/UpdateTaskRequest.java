package Devtiro.Task.domain;

import java.time.LocalDate;

import Devtiro.Task.domain.entity.TaskPriority;
import Devtiro.Task.domain.entity.TaskStatus;

public record UpdateTaskRequest(
        String title,
        String description,
        LocalDate dueDate,
        TaskStatus status,
        TaskPriority priority

) {

}
