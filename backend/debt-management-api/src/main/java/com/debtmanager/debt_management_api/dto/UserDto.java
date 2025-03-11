package com.debtmanager.debt_management_api.dto;

import lombok.Data;

@Data
public class UserDto {
    private String username;
    private String email;
    private String passwordHash;
}
