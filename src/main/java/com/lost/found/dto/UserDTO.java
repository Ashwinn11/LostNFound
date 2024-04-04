package com.lost.found.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class UserDTO {
    private String emailId;

    private String firstName;

    private String lastName;
}
