package com.prt.pom.dtos;

import com.prt.pom.model.Project;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.DocumentReference;
@Data
public class MileStoneDto {
    private String id;
    private String projectId;
    private String title;
    private String description;
    private boolean stoneStatus;
}
