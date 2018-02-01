package com.codingdojo.secondweek.relationships.repositories;

import org.springframework.data.repository.CrudRepository;


import org.springframework.stereotype.Repository;

import com.codingdojo.secondweek.relationships.models.License;


@Repository
public interface LicenseRepository extends CrudRepository<License, Long> {
	public License findOneByPersonId(Long person_id);

}