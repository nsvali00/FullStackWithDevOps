package com.workout.taskmanager.controller;

import com.workout.taskmanager.common.ApiResponse;
import com.workout.taskmanager.dto.TaskRequestDTO;
import com.workout.taskmanager.dto.TaskResponseDTO;
import com.workout.taskmanager.model.Task;
import com.workout.taskmanager.service.TaskService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Valid
@RequestMapping("/api/tasks")
public class TaskController {
    private final TaskService taskService;

    public TaskController(TaskService taskService){
        this.taskService = taskService;
    }

    @GetMapping("/all")
    public ResponseEntity<ApiResponse<List<TaskResponseDTO>>> getAllTask(){
        List<TaskResponseDTO> allTasks = taskService.getAllTasks();
        allTasks.forEach(System.out::println);
        ApiResponse<List<TaskResponseDTO>> apiResponse = new ApiResponse<>();
        apiResponse.setData(allTasks);
        apiResponse.setStatus(HttpStatus.OK);
        apiResponse.setMessage("Tasks fetched successfully");
        return ResponseEntity.ok(apiResponse);
    }
    @GetMapping("/{id}")
    private ResponseEntity<ApiResponse<TaskResponseDTO>> getTaskById(@PathVariable Long id){
        TaskResponseDTO taskResponseDTO = taskService.getTaskById(id);
        ApiResponse<TaskResponseDTO> apiResponse = new ApiResponse<>();
        apiResponse.setData(taskResponseDTO);
        apiResponse.setStatus(HttpStatus.OK);
        apiResponse.setMessage("Task fetched successfully");
        return ResponseEntity.ok(apiResponse);
    }

    @PostMapping
    public ResponseEntity<ApiResponse<TaskResponseDTO>> createTask(@RequestBody TaskRequestDTO newTask){
        TaskResponseDTO createdTaskDTO = taskService.createTask(newTask);
        ApiResponse<TaskResponseDTO> apiResponse = new ApiResponse<>();
        apiResponse.setData(createdTaskDTO);
        apiResponse.setStatus(HttpStatus.CREATED);
        apiResponse.setMessage("Task created successfully");
        return ResponseEntity.status(HttpStatus.CREATED).body(apiResponse);
    }





}
