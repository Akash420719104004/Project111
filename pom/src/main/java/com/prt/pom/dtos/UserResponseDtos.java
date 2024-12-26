package com.prt.pom.dtos;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;
@Setter
@Getter
@Builder
public class UserResponseDtos {
    @Id
    private String id;
    private String userName;
    private String emailId;
    private String mobileNo;
    private LocalDateTime createdAt;
    private LocalDateTime modifiedAt;
    private String gender;
    private String age;
    private boolean isActive;
}
