package com.RAGIR.Internship.Repository;

import com.RAGIR.Internship.DTO.Reponse.OrganizationResponseDTO;
import com.RAGIR.Internship.Model.Organization;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrganizationRepository extends JpaRepository<Organization, Integer> {
    @Query("SELECT o FROM Organization o WHERE o.name = :name")
    List<Organization> findByName(@Param("name") String name);
}
