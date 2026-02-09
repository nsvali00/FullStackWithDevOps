package com.workout.taskmanager.service;

import com.workout.taskmanager.model.Task;
import com.workout.taskmanager.repository.TaskRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TaskService {

    Logger logger = LoggerFactory.getLogger(TaskService.class);
    public TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public List<Task> getCompletedTasks(){
        return taskRepository.findAll().stream().filter(Task::isCompleted).toList();
    }

    public List<Task> getAllTasks(){
        return taskRepository.findAll();
    }

}
