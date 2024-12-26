package com.prt.pom.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
@Data
public class Project {
    @Id
    private String projectId;
    private String projectName;
    private String description;
}
