package Devtiro.Task.mapper.impl;

import Devtiro.Task.domain.CreateTaskRequest;
import Devtiro.Task.domain.UpdateTaskRequest;
import Devtiro.Task.domain.dto.CreateTaskRequestDto;
import Devtiro.Task.domain.dto.TaskDto;
import Devtiro.Task.domain.dto.UpdateTaskRequestDto;
import Devtiro.Task.domain.entity.Task;
import Devtiro.Task.mapper.TaskMapper;

public class TaskMapperImpl implements TaskMapper {
    @Override
    public CreateTaskRequest fromDto(CreateTaskRequestDto dto) {
        return new CreateTaskRequest(
                dto.title(),
                dto.description(),
                dto.dueDate(),
                dto.priority());
    }

    @Override
    public TaskDto toDto(Task task) {
        return new TaskDto(
                task.getId(),
                task.getTitle(),
                task.getDescription(),
                task.getDueDate(),
                task.getPriority(),
                task.getStatus());
    }

    @Override
    public UpdateTaskRequest fromDto(UpdateTaskRequestDto dto) {
        return new UpdateTaskRequest(
                dto.title(),
                dto.description(),
                dto.dueDate(),
                dto.status(),
                dto.priority());
    }

}
