package com.workout.taskmanager.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;
@Entity
@Getter
@Setter
public class Task {
    // maybe setter not wanted and needed
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
//    private String description;
//    private LocalDateTime createdAt;
//    private LocalDateTime updatedAt;
    private boolean completed;

    public Task() {
    }

    public Task(Long id, String name, boolean completed) {
        this.id = id;
        this.name = name;
        this.completed = completed;
    }
}
