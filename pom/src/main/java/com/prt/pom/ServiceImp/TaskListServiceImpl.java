package com.prt.pom.ServiceImp;

import com.prt.pom.Repository.MileStoneRepository;
import com.prt.pom.Repository.TaskListRespository;
import com.prt.pom.ServiceImp.Service.TaskListService;
import com.prt.pom.dtos.TaskListDto;
import com.prt.pom.model.MileStone;
import com.prt.pom.model.TaskList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class TaskListServiceImpl implements TaskListService {
    @Autowired
    MileStoneRepository mileStoneRepository;
    @Autowired
    TaskListRespository taskListRespository;
    @Override
    public String addTaskList(TaskListDto taskListDto) {
        TaskList taskList = new TaskList();
        taskList.setTaskName(taskListDto.getTaskName());
      //  List<String> mileStoneIds;
//        if (taskListDto.getMileStoneId() instanceof List) {
//            mileStoneIds = (List<String>) taskListDto.getMileStoneId();
//        } else {
//            mileStoneIds = Collections.singletonList(String.valueOf(taskListDto.getMileStoneId()));
//        }
        List<MileStone> mileStones = (List<MileStone>) taskListDto.getMileStoneId().stream().map(id->mileStoneRepository.findById(id).orElseThrow(()->new RuntimeException("MileStone Not Found"+ id))).toList();
        taskList.setMileStoneId(mileStones);
        taskListRespository.save(taskList);
        return "TaskList Added";
    }
}
