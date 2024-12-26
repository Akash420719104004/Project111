package com.prt.pom.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

@Data
public class TaskList {
    @Id
    private String id;
    private String taskName;
    @DocumentReference
    private List<MileStone> mileStoneId;
}
