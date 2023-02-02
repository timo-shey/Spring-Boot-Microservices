package com.example.organizationservice.service;

import com.example.organizationservice.dto.OrganizationDto;
import org.springframework.stereotype.Service;

@Service
public interface OrganizationService {
    OrganizationDto saveOrganization(OrganizationDto organizationDto);
    OrganizationDto getOrganizationByCode(String organizationCode);
}
