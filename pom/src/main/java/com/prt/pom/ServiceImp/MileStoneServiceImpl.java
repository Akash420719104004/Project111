package com.prt.pom.ServiceImp;

import com.prt.pom.Repository.MileStoneRepository;
import com.prt.pom.Repository.ProjectRepository;
import com.prt.pom.ServiceImp.Service.MileStoneService;
import com.prt.pom.dtos.MileStoneDto;
import com.prt.pom.model.MileStone;
import com.prt.pom.model.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MileStoneServiceImpl implements MileStoneService {
    @Autowired
    ProjectRepository projectRepository;
    @Autowired
    MileStoneRepository mileStoneRepository;
    @Override
    public String addMileStone(MileStoneDto mileStoneDto) {
//        Project project = projectRepository.findById(mileStoneDto.getId())
//                .orElseThrow(() -> new RuntimeException("Project Not Found"));
        MileStone mileStone = new MileStone();
        mileStone.setProjectId(projectRepository.findById(mileStoneDto.getProjectId()).get());
        mileStone.setDescription(mileStoneDto.getDescription());
        mileStone.setTitle(mileStoneDto.getTitle());
        mileStone.setStoneStatus(mileStoneDto.isStoneStatus());
        mileStoneRepository.save(mileStone);
        return "MileStone Added";
    }
}
