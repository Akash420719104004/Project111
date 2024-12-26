package com.prt.pom.ServiceImp.Service;

import com.prt.pom.dtos.RoleDto;
import com.prt.pom.dtos.UserDto;
import com.prt.pom.dtos.UserResponseDtos;

public interface UserService {
   String addUser(UserDto userDto);
   String getFindByAggregationByName(String mobileNo1);
   UserResponseDtos getUserResponseDtos(String userId);
   String addRole(RoleDto roleDto);
}
