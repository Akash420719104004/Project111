package com.prt.pom.controller;
import com.prt.pom.ServiceImp.Service.ProjectService;
import com.prt.pom.dtos.ProjectDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
public class ProjectController {
    @Autowired
    ProjectService projectService;
    @PostMapping("/addProject")
    public ResponseEntity<String> addProject(ProjectDto projectDto){
        String response=projectService.addProject(projectDto);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }
}
