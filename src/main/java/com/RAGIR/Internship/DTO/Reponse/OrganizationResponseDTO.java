package com.RAGIR.Internship.DTO.Reponse;

import com.RAGIR.Internship.Enum.Activity;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrganizationResponseDTO {

    String OrganizationId;

     String name;

     String email;

     String phone;

    private Activity activity;


}
