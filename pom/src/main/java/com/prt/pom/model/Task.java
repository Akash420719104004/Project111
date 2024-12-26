package com.prt.pom.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

@Data
public class Task {
    @Id
    private String id;
    private String taskName;
    private String taskNo;
    @DocumentReference
    private List<TaskList> taskList;
}
