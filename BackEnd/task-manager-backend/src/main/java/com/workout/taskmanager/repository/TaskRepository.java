package com.workout.taskmanager.repository;

import com.workout.taskmanager.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task,Long> {

    /**
     * Get all tasks that are completed
     * @param completed - true if task is completed
     * @return {@code List} of Task data
     */
    List<Task> getTasksByCompleted(boolean completed);
}
