package com.prt.pom.ServiceImp;
import com.prt.pom.Repository.SubTaskRepository;
import com.prt.pom.Repository.SubtaskListRepository;
import com.prt.pom.Repository.TaskRepository;
import com.prt.pom.ServiceImp.Service.SubTaskListService;
import com.prt.pom.dtos.SubTaskDto;
import com.prt.pom.dtos.SubTaskListDto;
import com.prt.pom.model.SubTask;
import com.prt.pom.model.SubtaskList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class SubTaskServiceImpl implements SubTaskListService {
    @Autowired
    TaskRepository taskRepository;
    @Autowired
    SubtaskListRepository subtaskListRepository;
    @Autowired
    SubTaskRepository subTaskRepository;

    @Override
    public String addSubTaskList(SubTaskListDto subTaskListDto) {
        SubtaskList subtaskList = new SubtaskList();
        subtaskList.setSubTaskName(subTaskListDto.getSubTaskName());
        subtaskList.setTask(taskRepository.findById(subTaskListDto.getTask()).get());
        subtaskListRepository.save(subtaskList);
        return "SubTaskList Added";
    }

    @Override
    public String addSubTask(SubTaskDto subTaskDto) {
        SubTask subTask = new SubTask();
        subTask.setSubtaskName(subTaskDto.getSubTaskName());
        subTask.setSubtaskLists(
                subTaskDto.getSubTaskList().stream()
                        .map(id -> subtaskListRepository.findById(id)
                                .orElseThrow(() -> new RuntimeException("SubTaskList Not Found: " + id)))
                        .toList()
        );
        subTaskRepository.save(subTask);
        return "SubTask Added Successfully";
    }
}

