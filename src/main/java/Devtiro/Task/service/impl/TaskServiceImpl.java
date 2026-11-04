package Devtiro.Task.service.impl;

import java.time.Instant;

import org.springframework.stereotype.Service;

import Devtiro.Task.domain.CreateTaskRequest;
import Devtiro.Task.domain.entity.Task;
import Devtiro.Task.domain.entity.TaskStatus;
import Devtiro.Task.repository.TaskRepository;
import Devtiro.Task.service.TaskService;

@Service
public class TaskServiceImpl implements TaskService {

    private final TaskRepository taskRepository;

    public TaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public Task createTask(CreateTaskRequest request) {
        Instant now = Instant.now();

        Task task = new Task(
                null,
                request.title(),
                request.description(),
                request.dueDate(),
                TaskStatus.OPEN,
                request.priority(),
                now,
                now);

        return taskRepository.save(task);
    }
}
