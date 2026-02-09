package com.workout.taskmanager.controller;

import com.workout.taskmanager.model.Task;
import com.workout.taskmanager.repository.TaskRepository;
import com.workout.taskmanager.service.TaskService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    public TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping("/completed")
    public List<Task> getCompletedTasks() {
        return taskService.getCompletedTasks();
    }
    @GetMapping("/all")
    public List<Task> getAllTasks(){
        return taskService.getAllTasks();
    }
}
