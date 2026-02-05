package com.workout.taskmanager.service;

import com.workout.taskmanager.model.Task;
import com.workout.taskmanager.repository.TaskRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    Logger logger = LoggerFactory.getLogger(TaskService.class);
    public TaskRepository taskRepository;

    public List<Task> getTasksByCompleted(boolean completed){
        logger.info("HELLO");
        return taskRepository.getTasksByCompleted(completed);
    }

}
