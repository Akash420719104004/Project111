package com.prt.pom.Repository;

import com.prt.pom.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface UserRepository extends MongoRepository <User,String>{
    Optional<Object> findByMobileNo(String mobileNo);
}
