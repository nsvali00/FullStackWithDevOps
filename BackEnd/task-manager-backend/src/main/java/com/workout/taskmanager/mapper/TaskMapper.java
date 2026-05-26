package com.workout.taskmanager.mapper;

import com.workout.taskmanager.dto.request.TaskCreateRequest;
import com.workout.taskmanager.dto.request.TaskUpdateRequest;
import com.workout.taskmanager.dto.response.TaskResponseDTO;
import com.workout.taskmanager.model.Task;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring")
public interface TaskMapper {

    TaskResponseDTO toDto(Task task);

    Task toEntity(TaskCreateRequest request);

    // 🔥 PATCH MAGIC
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateTaskFromDto(TaskUpdateRequest dto, @MappingTarget Task entity);
}