package com.prt.pom.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

@Data
public class SubtaskList {
    private String id;
    private String subTaskName;
    @DocumentReference
    private Task task;
}
