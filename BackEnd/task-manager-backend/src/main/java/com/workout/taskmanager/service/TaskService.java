package com.workout.taskmanager.service;

import com.workout.taskmanager.model.Task;
import com.workout.taskmanager.repository.TaskRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class TaskService {

    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public List<Task> getAllTasks(){
        List<Task> allTasks = taskRepository.findAll();
        allTasks.forEach(System.out::println);
        return allTasks;
    }


}
