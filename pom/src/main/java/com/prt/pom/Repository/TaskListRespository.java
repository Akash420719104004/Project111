package com.prt.pom.Repository;

import com.prt.pom.model.TaskList;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TaskListRespository extends MongoRepository<TaskList,String> {
}
