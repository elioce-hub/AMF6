package com.example.amf.front.thymeleaf.sample.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MemberDto {
    private Long id;
    private String name;
    private String password;
    private Long teamId;
    private String role;
    private ContactDto contact;
}
