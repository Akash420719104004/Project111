package com.prt.pom.dtos;

import lombok.Data;

import java.util.List;

@Data
public class TaskListDto {
    private String id;
    private String taskName;
    private List<String> mileStoneId;
}
