package com.prt.pom.controller;

import com.prt.pom.ServiceImp.Service.*;
import com.prt.pom.ServiceImp.UserServiceImpl;
import com.prt.pom.dtos.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @Autowired
    UserService userService;
    @Autowired
    ProjectService projectService;
    @Autowired
    TaskListService taskListService;
    @Autowired
    MileStoneService mileStoneService;
    @Autowired
    UserServiceImpl  userServiceImpl;
    @Autowired
    TaskService taskService;
    @Autowired
    SubTaskListService subTaskListService;


    @PostMapping("/addProject")
    public ResponseEntity<String> addProject(@RequestBody ProjectDto projectDto){
        String response=projectService.addProject(projectDto);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }
    @PostMapping("/addMileStone")
    public String addMileStone(@RequestBody MileStoneDto mileStoneDto){
        String response=mileStoneService.addMileStone(mileStoneDto);
        return String.valueOf(new ResponseEntity<String>(response, HttpStatus.CREATED));
    }
    @PostMapping("/add/taskList")
    public String addTaskList(@RequestBody TaskListDto taskListDto){
        return taskListService.addTaskList(taskListDto);
    }
    @PostMapping("add/Task")
    public ResponseEntity<String> addTask(@RequestBody TaskDto taskDto){
        String res=taskService.addTask(taskDto);
        return new ResponseEntity<>(res,HttpStatus.CREATED);
    }
    @GetMapping("/getAggregate/mobile")
    public ResponseEntity<String> getFindByAggregationByName(String mobileNo){
        String response= userServiceImpl.getFindByAggregationByName(mobileNo);
        return new ResponseEntity<>(response,HttpStatus.OK);
    }
    @PostMapping("/")
    public String addUser(@RequestBody UserDto userDto){
        return  userService.addUser(userDto);
    }
    @GetMapping("/getUserResponseDtos")
    public ResponseEntity<UserResponseDtos> getUserResponseDtos(@RequestParam String userId){
       UserResponseDtos response= userService.getUserResponseDtos(userId);
        return new ResponseEntity<>(response,HttpStatus.OK);
    }
   @PostMapping("/add/subTaskList")
    public ResponseEntity<String> addSubTask(@RequestBody SubTaskListDto subTaskListDto){
        String res= subTaskListService.addSubTaskList(subTaskListDto);
        return new ResponseEntity<>(res,HttpStatus.CREATED);
    }
    @PostMapping("/add/SubTask")
    public  ResponseEntity<String> addSubTask(@RequestBody SubTaskDto subTaskDto) {
        String res=subTaskListService.addSubTask(subTaskDto);
        return new ResponseEntity<>(res,HttpStatus.CREATED);
    }
    @PostMapping("/add/Role")
    public String addRole(@RequestBody RoleDto roleDto){
        return userService.addRole(roleDto);
    }
    }

