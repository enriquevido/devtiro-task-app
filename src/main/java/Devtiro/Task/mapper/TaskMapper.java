package Devtiro.Task.mapper;

import Devtiro.Task.domain.CreateTaskRequest;
import Devtiro.Task.domain.UpdateTaskRequest;
import Devtiro.Task.domain.dto.CreateTaskRequestDto;
import Devtiro.Task.domain.dto.TaskDto;
import Devtiro.Task.domain.dto.UpdateTaskRequestDto;
import Devtiro.Task.domain.entity.Task;

public interface TaskMapper {
    CreateTaskRequest fromDto(CreateTaskRequestDto dto);

    UpdateTaskRequest fromDto(UpdateTaskRequestDto dto);

    TaskDto toDto(Task task);
}
