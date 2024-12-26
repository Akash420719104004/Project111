package com.prt.pom.ServiceImp.Service;

import com.prt.pom.dtos.SubTaskDto;
import com.prt.pom.dtos.SubTaskListDto;
import com.prt.pom.model.SubTask;

public interface SubTaskListService {
    String addSubTaskList(SubTaskListDto subTaskListDto);
    String addSubTask(SubTaskDto subTaskDto);
}
