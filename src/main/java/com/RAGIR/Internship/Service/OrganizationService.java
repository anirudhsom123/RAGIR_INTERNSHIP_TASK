package com.RAGIR.Internship.Service;

import com.RAGIR.Internship.DTO.Reponse.OrganizationResponseDTO;
import com.RAGIR.Internship.DTO.Request.OrganizationRequestDTO;
import com.RAGIR.Internship.Exceptions.OrganizationNotFoundException;
import com.RAGIR.Internship.Model.Organization;
import com.RAGIR.Internship.Repository.OrganizationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrganizationService {

    @Autowired
    OrganizationRepository organizationRepository;


    public void addOrganizer(OrganizationRequestDTO organizationRequestDTO) {
    Organization requestOrganization=OrganizationRequestDTO2Organization(organizationRequestDTO);

    requestOrganization=generateOrganizationId(requestOrganization);

    // organizationRepository.save(requestOrganization);
    }
    public Organization generateOrganizationId(Organization organization) {

        Organization savedOrganization = organizationRepository.save(organization);


        String organizationId = String.format("ORG%05d", savedOrganization.getId());

        savedOrganization.setOrganizationId(organizationId);

        return organizationRepository.save(savedOrganization);
    }

    public OrganizationResponseDTO getUsedById(int id) {
        Optional<Organization> optionalOrganization=organizationRepository.findById(id);
        if(optionalOrganization.isEmpty()){
            throw new OrganizationNotFoundException("invalid id");
        }
        Organization organization=optionalOrganization.get();

        return  Organization2ResponseDTO(organization);

    }

    private OrganizationResponseDTO Organization2ResponseDTO(Organization organization) {
        return OrganizationResponseDTO.builder()
                .OrganizationId(organization.getOrganizationId())
                .name(organization.getName())
                .phone(organization.getPhone())
                .email(organization.getEmail())
                .activity(organization.getActivity())
                .build();
    }

    public Organization OrganizationRequestDTO2Organization(OrganizationRequestDTO organizationRequestDTO){
        return Organization.builder()
                .name(organizationRequestDTO.getName())
                .phone(organizationRequestDTO.getPhone())
                .email(organizationRequestDTO.getEmail())
                .activity(organizationRequestDTO.getActivity())
                .build();
    }


    public List<Organization> getUserByName(String name) {
        List<Organization> optionalOrganization=organizationRepository.findByName(name);
        return optionalOrganization;
    }
}
