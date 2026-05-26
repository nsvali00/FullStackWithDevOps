package com.workout.taskmanager.service;

import com.workout.taskmanager.dto.TaskRequestDTO;
import com.workout.taskmanager.dto.TaskRequestMapper;
import com.workout.taskmanager.dto.TaskResponseDTO;
import com.workout.taskmanager.dto.TaskResponseMapper;
import com.workout.taskmanager.exceptions.TaskNotFoundException;
import com.workout.taskmanager.model.Task;
import com.workout.taskmanager.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class TaskService {

    private final TaskRepository taskRepository;
    private final TaskRequestMapper taskRequestMapper;
    private final TaskResponseMapper taskResponseMapper;

    public TaskService(TaskRepository taskRepository, TaskRequestMapper taskRequestMapper, TaskResponseMapper taskResponseMapper) {
        this.taskRepository = taskRepository;
        this.taskRequestMapper = taskRequestMapper;
        this.taskResponseMapper = taskResponseMapper;
    }

    public List<TaskResponseDTO> getAllTasks() {
        return taskRepository.findAll().stream().map(taskResponseMapper::toResponseDto).toList();
    }

    public TaskResponseDTO getTaskById(Long id) {
        Task task = taskRepository.findById(id).orElseThrow(() -> new TaskNotFoundException(id));
        return taskResponseMapper.toResponseDto(task);
    }

    public TaskResponseDTO createTask(TaskRequestDTO newTaskDto) {
        Task task = taskRequestMapper.toEntity(newTaskDto);
        task = taskRepository.save(task);
        return taskResponseMapper.toResponseDto(task);
    }


}
