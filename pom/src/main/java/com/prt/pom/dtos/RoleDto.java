package com.prt.pom.dtos;
import lombok.Data;
import java.time.LocalDateTime;
@Data
public class RoleDto {
    private String id;
    private int roleNo;
    private String roleName;
    private LocalDateTime createdAt;
    private String createdBy;
    private LocalDateTime modifiedAt;
    private String modifiedBy;
}
