package com.prt.pom.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;
@Data
public class SubTask {
    private String id;
    private String subtaskName;
    @DocumentReference
    private List<SubtaskList>subtaskLists;
}
