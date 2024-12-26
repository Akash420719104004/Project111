package com.prt.pom.Repository;

import com.prt.pom.model.SubtaskList;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SubtaskListRepository extends MongoRepository<SubtaskList,String> {
}
