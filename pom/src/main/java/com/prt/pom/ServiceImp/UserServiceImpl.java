package com.prt.pom.ServiceImp;
import com.prt.pom.Repository.RoleRepository;
import com.prt.pom.Repository.UserRepository;
import com.prt.pom.ServiceImp.Service.UserService;
import com.prt.pom.dtos.RoleDto;
import com.prt.pom.dtos.UserDto;
import com.prt.pom.dtos.UserResponseDtos;
import com.prt.pom.model.Role;
import com.prt.pom.model.User;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.aggregation.Aggregation;
import org.springframework.data.mongodb.core.aggregation.AggregationResults;
import org.springframework.data.mongodb.core.aggregation.MatchOperation;
import org.springframework.data.mongodb.core.aggregation.ProjectionOperation;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;
    @Autowired
    MongoTemplate template;
    @Autowired
    RoleRepository roleRepository;
    @Override
    public String addUser(UserDto userDto) {
        User user;
        if (StringUtils.isNotBlank(userDto.getId())) {
            user = userRepository.findById(userDto.getId())
                    .orElseThrow(() -> new RuntimeException("User not found"));
            user.setModifiedAt(LocalDateTime.now());
            user.setModifiedBy(userDto.getModifiedBy());
        } else {
            user = new User();
            user.setCreatedAt(LocalDateTime.now());
            user.setCreatedBy(userDto.getCreatedBy());
        }
        user.setUserName(userDto.getUserName());
        user.setMobileNo(userDto.getMobileNo());
        user.setActive(userDto.isActive());
        user.setDob(userDto.getDob());
        user.setDoj(userDto.getDoj());
        user.setGender(userDto.getGender());
        user.setAge(userDto.getAge());
        user.setRoleId(roleRepository.findById(userDto.getRoleId()).get());
        userRepository.save(user);
        return StringUtils.isNotBlank(userDto.getId()) ? "User Updated Successfully" : "User Added Successfully";
    }
    @Override
    public String getFindByAggregationByName(String mobileNo1) {
        MatchOperation match = Aggregation.match(Criteria.where("mobileNo").is(mobileNo1));
        ProjectionOperation project = Aggregation.project("userName");
        Aggregation aggregation = Aggregation.newAggregation(match, project);
        AggregationResults<User> result = template.aggregate(aggregation, User.class, User.class);
        List<User> users = result.getMappedResults();
        if (users != null && !users.isEmpty()) {
            return users.get(0).getUserName();
        }
        return null;
    }
    @Override
    public UserResponseDtos getUserResponseDtos(String userId) {
       User user= userRepository.findById(userId).orElseThrow(()->new RuntimeException("User Not Found"));
        UserResponseDtos userResponseDtos= UserResponseDtos.builder().build();
        userResponseDtos.setUserName(user.getUserName());
        userResponseDtos.setGender(user.getGender());
        userResponseDtos.setAge(user.getAge());
        userResponseDtos.setActive(user.isActive());
        userResponseDtos.setCreatedAt(LocalDateTime.now());
        userResponseDtos.setMobileNo(user.getMobileNo());
        userResponseDtos.setEmailId(user.getEmailId());
        return userResponseDtos;
    }

    @Override
    public String addRole(RoleDto roleDto) {
        Role role=new Role();
        role.setRoleNo(roleDto.getRoleNo());
        role.setRoleName(roleDto.getRoleName());
        role.setCreatedAt(LocalDateTime.now());
        role.setModifiedAt(LocalDateTime.now());
        role.setCreatedBy(roleDto.getCreatedBy());
        role.setModifiedBy(roleDto.getModifiedBy());
        roleRepository.save(role);
        return "Role Added";
    }
}