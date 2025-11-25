package com.RAGIR.Internship.Model;

import com.RAGIR.Internship.Enum.Activity;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Organization {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    @Column

    private  String OrganizationId;

    @Column
    private String name;

    @Column
    private String email;

    @Column(length = 10)
    private String phone;

    @Column
    @Enumerated(value = EnumType.STRING)
    private Activity activity;

    @Column
    @CreationTimestamp
    Date createdAt;

}
