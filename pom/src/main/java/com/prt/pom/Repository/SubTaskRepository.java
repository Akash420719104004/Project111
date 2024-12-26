package com.prt.pom.Repository;

import com.prt.pom.model.SubTask;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SubTaskRepository extends MongoRepository<SubTask,String> {
}
