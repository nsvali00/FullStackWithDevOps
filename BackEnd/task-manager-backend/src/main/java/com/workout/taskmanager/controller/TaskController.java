package com.workout.taskmanager.controller;

import com.workout.taskmanager.model.Task;
import com.workout.taskmanager.service.TaskService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {
    private final TaskService taskService;

    public TaskController(TaskService taskService){
        this.taskService = taskService;
    }

    @GetMapping("/all")
    public List<Task> getAllTask(){
        List<Task> allTasks = taskService.getAllTasks();
        allTasks.forEach(System.out::println);
        return allTasks;
    }





}
