package com.workout.taskmanager.controller;

import com.workout.taskmanager.model.Task;
import com.workout.taskmanager.service.TaskService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class TaskController {

    public TaskService taskService;

    @GetMapping("/completed")
    public List<Task> getTasksByCompleted(boolean completed){
        return taskService.getTasksByCompleted(completed);
    }
}
