package com.kevin.ai_task_tracker.model;

import lombok.Data;

@Data
public class Task {
    private Long id;
    private String title;
    private boolean completed;
}
