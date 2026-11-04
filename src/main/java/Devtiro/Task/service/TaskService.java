package Devtiro.Task.service;

import java.util.List;
import java.util.UUID;

import Devtiro.Task.domain.CreateTaskRequest;
import Devtiro.Task.domain.UpdateTaskRequest;
import Devtiro.Task.domain.entity.Task;

public interface TaskService {
    Task createTask(CreateTaskRequest request);

    List<Task> listTasks();

    Task updateTask(UUID taskId, UpdateTaskRequest request);

    void deleteTask(UUID taskId);
}
