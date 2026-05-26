package com.workout.taskmanager.dto;

import com.workout.taskmanager.model.Task;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TaskRequestMapper {
    Task toEntity(TaskRequestDTO requestDTO);
}
