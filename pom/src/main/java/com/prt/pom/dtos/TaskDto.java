package com.prt.pom.dtos;

import lombok.Data;

import java.util.List;

@Data
public class TaskDto
{
    private String id;
    private String taskName;
    private String taskNo;
    private List<String> taskList;
}
