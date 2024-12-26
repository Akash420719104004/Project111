package com.prt.pom.ServiceImp;

import com.prt.pom.Repository.TaskListRespository;
import com.prt.pom.Repository.TaskRepository;
import com.prt.pom.ServiceImp.Service.TaskService;
import com.prt.pom.dtos.TaskDto;
import com.prt.pom.model.Task;
import com.prt.pom.model.TaskList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {
    @Autowired
    TaskListRespository taskListRespository;
    @Autowired
    TaskRepository taskRepository;

    @Override
    public String addTask(TaskDto taskDto) {
        List<TaskList> taskLists = taskDto.getTaskList().stream()
                .map(id -> taskListRespository.findById(id)
                        .orElseThrow(() -> new IllegalArgumentException("TaskList not found with ID: " + id)))
                .toList();
        Task task = new Task();
        task.setTaskName(taskDto.getTaskName());
        task.setTaskNo(taskDto.getTaskNo());
        task.setTaskList(taskLists);
        taskRepository.save(task);
        return "Task Added Successfully";
    }
}
