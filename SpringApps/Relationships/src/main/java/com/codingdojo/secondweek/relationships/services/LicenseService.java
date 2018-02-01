package com.codingdojo.secondweek.relationships.services;

import org.springframework.stereotype.Service;
import java.util.List;


import com.codingdojo.secondweek.relationships.models.License;

import com.codingdojo.secondweek.relationships.repositories.LicenseRepository;

@Service
public class LicenseService {
	private LicenseRepository lr;
	
	public LicenseService(LicenseRepository lr) {
		this.lr = lr;
	}
	

	public License getLicense(Long id) {
		return lr.findOne(id);
	}
	
	public License findLicense(Long person_id) {
		return lr.findOneByPersonId(person_id);
	}
	
	public List<License> allLicenses(){
		return (List<License>) lr.findAll();
	}
	
	public void createLicense(License license) {
		lr.save(license);
	}
}