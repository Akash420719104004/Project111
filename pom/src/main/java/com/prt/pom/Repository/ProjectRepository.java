package com.prt.pom.Repository;

import com.prt.pom.model.Project;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface ProjectRepository extends MongoRepository<Project,String> {
    @Query("{'projectName':?0}")
    boolean findByProjectName(String projectName);
}
