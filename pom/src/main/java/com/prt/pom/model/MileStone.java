package com.prt.pom.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

@Data
public class MileStone {
    @Id
    private String id;
    @DocumentReference
    private Project projectId;
    private String title;
    private String description;
    private boolean stoneStatus;
}
