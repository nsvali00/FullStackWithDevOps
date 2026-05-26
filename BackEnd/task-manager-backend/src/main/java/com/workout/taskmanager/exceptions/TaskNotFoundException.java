package com.workout.taskmanager.exceptions;

import org.springframework.http.HttpStatusCode;

import java.time.LocalDateTime;

public class TaskNotFoundException extends RuntimeException{

    public TaskNotFoundException(Long id){
        super("Task with ID " +  id + " not found");
    }
}
