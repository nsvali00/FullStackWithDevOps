package com.workout.taskmanager.service;

import com.workout.taskmanager.model.Task;
import com.workout.taskmanager.repository.TaskRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class TaskService {

    public TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public List<Task> getCompletedTasks() {
        return taskRepository.findAll().stream().filter(Task::isCompleted).toList();
    }

    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    public Task createTask(Task newTask) throws IllegalArgumentException {
        if (newTask.getName() == null || newTask.getName().isBlank()) {
            throw new IllegalArgumentException("Name value is empty");
        }
        return taskRepository.save(newTask);
    }

    public Task updateTask(Task newTaskInfo, Long taskId) {
        Optional<Task> wantedTask = taskRepository.findById(taskId);

        if (wantedTask.isEmpty()) {
            throw new IllegalArgumentException("Failed to find task with ID: " + taskId);
        } else {
            Task task = wantedTask.get();
            task.setCompleted(newTaskInfo.isCompleted());
            task.setName(newTaskInfo.getName());
            return taskRepository.save(task);
        }
    }

    public void deleteTask(Long id) {
        Task taskData = taskRepository.findById(id)
                .orElseThrow();
        taskRepository.delete(taskData);

    }

}
