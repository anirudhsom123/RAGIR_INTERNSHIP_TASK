package com.RAGIR.Internship.Controller;

import com.RAGIR.Internship.DTO.Reponse.OrganizationResponseDTO;
import com.RAGIR.Internship.DTO.Request.OrganizationRequestDTO;
import com.RAGIR.Internship.Exceptions.OrganizationAlreadyExistExpection;
import com.RAGIR.Internship.Exceptions.OrganizationNotFoundException;
import com.RAGIR.Internship.Model.Organization;
import com.RAGIR.Internship.Service.OrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/organizers")
public class OrganizationController {
    @Autowired
    OrganizationService organizationService;

    @PostMapping
    public ResponseEntity addOrganizer(@RequestBody OrganizationRequestDTO organizationRequestDTO){

        try{
            organizationService.addOrganizer(organizationRequestDTO);

            return new ResponseEntity("success", HttpStatus.OK);
        } catch(OrganizationAlreadyExistExpection e){

            return new ResponseEntity(e.getMessage(),HttpStatus.BAD_REQUEST);
        }

    }
    @GetMapping("/{id}")
    public ResponseEntity getUserById(@PathVariable("id") int id){

        try{
            return new ResponseEntity(organizationService.getUsedById(id),HttpStatus.OK);

        }catch (OrganizationNotFoundException e){
            return new ResponseEntity(e.getMessage(),HttpStatus.NOT_FOUND);
        }
        }

}
