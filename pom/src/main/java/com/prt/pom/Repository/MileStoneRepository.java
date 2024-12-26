package com.prt.pom.Repository;

import com.prt.pom.model.MileStone;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MileStoneRepository extends MongoRepository<MileStone,String> {
}
