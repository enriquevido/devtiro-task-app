package Devtiro.Task.domain.dto;

import java.time.LocalDate;
import java.util.UUID;

import Devtiro.Task.domain.entity.TaskPriority;
import Devtiro.Task.domain.entity.TaskStatus;

public record TaskDto(
        UUID id,
        String title,
        String description,
        LocalDate dueDate,
        TaskPriority priority,
        TaskStatus status) {

}
