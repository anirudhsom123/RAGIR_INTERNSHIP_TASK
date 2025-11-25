package com.RAGIR.Internship.DTO.Request;

import com.RAGIR.Internship.Enum.Activity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class OrganizationRequestDTO {

    private String name;

    private String email;

    private String phone;

    private Activity activity;

    // getter setter and constructor using lombok
}
