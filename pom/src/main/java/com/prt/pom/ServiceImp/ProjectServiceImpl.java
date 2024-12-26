package com.prt.pom.ServiceImp;

import com.prt.pom.Repository.ProjectRepository;
import com.prt.pom.ServiceImp.Service.ProjectService;
import com.prt.pom.dtos.ProjectDto;
import com.prt.pom.model.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectServiceImpl implements ProjectService {
    @Autowired
    ProjectRepository projectRepository;

    @Override
    public String addProject(ProjectDto projectDto) {

        Project project=new Project();
        project.setProjectName(projectDto.getProjectName());
        project.setDescription(projectDto.getDescription());
        projectRepository.save(project);
        return "Project Added";
    }
}
