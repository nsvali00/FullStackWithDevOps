package com.workout.taskmanager.service;

import com.workout.taskmanager.dto.request.TaskCreateRequest;
import com.workout.taskmanager.dto.request.TaskUpdateRequest;
import com.workout.taskmanager.dto.response.TaskResponseDTO;
import com.workout.taskmanager.exceptions.TaskNotFoundException;
import com.workout.taskmanager.mapper.TaskMapper;
import com.workout.taskmanager.entity.Task;
import com.workout.taskmanager.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    private final TaskRepository taskRepository;
    private final TaskMapper taskMapper;

    public TaskService(TaskRepository taskRepository, TaskMapper taskMapper) {
        this.taskRepository = taskRepository;
       this.taskMapper = taskMapper;
    }

    public List<TaskResponseDTO> getAllTasks() {
        return taskRepository.findAll().stream().map(taskMapper::toDto).toList();
    }

    public TaskResponseDTO getTaskById(Long id) {
        Task task = taskRepository.findById(id).orElseThrow(() -> new TaskNotFoundException(id));
        return taskMapper.toDto(task);
    }

    public TaskResponseDTO createTask(TaskCreateRequest newTaskDto) {
        Task task = taskMapper.toEntity(newTaskDto);
        task = taskRepository.save(task);
        return taskMapper.toDto(task);
    }

    public TaskResponseDTO patchTask(Long id, TaskUpdateRequest request) {
        Task task = taskRepository.findById(id)
                .orElseThrow(() -> new TaskNotFoundException(id));
        System.out.println("BEFORE: " + task.getName());
        taskMapper.updateTaskFromDto(request, task);
        System.out.println("AFTER: " + task.getName());
        task = taskRepository.save(task);
        return taskMapper.toDto(task);
    }


}
