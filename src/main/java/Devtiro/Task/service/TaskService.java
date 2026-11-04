package Devtiro.Task.service;

import Devtiro.Task.domain.CreateTaskRequest;
import Devtiro.Task.domain.entity.Task;

public interface TaskService {
    Task createTask(CreateTaskRequest request);
}
