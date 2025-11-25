package com.RAGIR.Internship.DTO.Reponse;

import com.RAGIR.Internship.Enum.Activity;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrganizationResponseDTO {

    private String OrganizationId;

    private String name;

    private String email;

    private String phone;

    private Activity activity;

    // getter setter and constructor using lombok


}
