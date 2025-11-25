package com.RAGIR.Internship.Repository;

import com.RAGIR.Internship.Model.Organization;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrganizationRepository extends JpaRepository<Organization, Integer> {
//    @Query("SELECT * From Organization where name = searchname")
//    List<Organization> findByName(@Param("searchname") String name);
}
