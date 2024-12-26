package com.prt.pom.dtos;

import lombok.Data;

import java.util.List;
@Data
public class SubTaskDto {
    private String id;
    private String subTaskName;
    private List<String>subTaskList;
}
