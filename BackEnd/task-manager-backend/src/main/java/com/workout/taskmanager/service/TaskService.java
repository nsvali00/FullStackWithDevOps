package com.workout.taskmanager.service;

import com.workout.taskmanager.exceptions.TaskNotFoundException;
import com.workout.taskmanager.model.Task;
import com.workout.taskmanager.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public List<Task> getAllTasks() {
        List<Task> allTasks = taskRepository.findAll();
        allTasks.forEach(System.out::println);
        return allTasks;
    }

    public Task getTaskById(Long id) {
        return taskRepository.findById(id).orElseThrow(() -> new TaskNotFoundException(id));
    }

    public Task createTask(Task newTask) {
        return taskRepository.save(newTask);
    }


}
