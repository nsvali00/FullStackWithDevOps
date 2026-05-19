package com.workout.taskmanager.controller;

import com.workout.taskmanager.model.Task;
import com.workout.taskmanager.service.TaskService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    @GetMapping("/{id}")
    private ResponseEntity<Task> getTaskById(@PathVariable Long id){
        Task task = taskService.getTaskById(id);
        return ResponseEntity.ok(task);
    }

    @PostMapping
    public ResponseEntity<Task> createTask(@RequestBody Task newTask){
        Task createdTask = taskService.createTask(newTask);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdTask);
    }





}
