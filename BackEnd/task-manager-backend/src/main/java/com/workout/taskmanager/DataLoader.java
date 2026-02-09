package com.workout.taskmanager;

import com.workout.taskmanager.model.Task;
import com.workout.taskmanager.repository.TaskRepository;
import org.springframework.stereotype.Component;

@Component
public class DataLoader {

        public DataLoader(TaskRepository taskRepository) {
            taskRepository.save(new Task(null, "Learn Spring Boot", false));
            taskRepository.save(new Task(null, "Build React UI", false));
        }

}
