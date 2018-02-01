package com.codingdojo.secondweek.dojosandninjas.services;

import java.util.List;


import org.springframework.stereotype.Service;

import com.codingdojo.secondweek.dojosandninjas.models.Dojo;
import com.codingdojo.secondweek.dojosandninjas.models.Ninja;
import com.codingdojo.secondweek.dojosandninjas.repositories.DojoRepository;
import com.codingdojo.secondweek.dojosandninjas.repositories.NinjaRepository;

@Service
public class NinjaDojoService {
	private NinjaRepository ninjaRepo;
	private DojoRepository dojoRepo;
	public NinjaDojoService(NinjaRepository ninjaRepo, DojoRepository dojoRepo) {
		this.ninjaRepo = ninjaRepo;
		this.dojoRepo = dojoRepo;
	}
	
	public List<Ninja> allNinjas() {
		return ninjaRepo.findAll();
	}
	
	public List<Dojo> allDojos() {
		return dojoRepo.findAll();
	}
	
	public void addDojo(Dojo dojo) {
		dojoRepo.save(dojo);
	}
	
	public void addNinja(Ninja ninja) {
		ninjaRepo.save(ninja);
	}
	
	public Dojo getDojo(Long id) {
		return dojoRepo.findOne(id);
	}
	
	public List<Ninja> dojoNinjas(Dojo dojo) {
		return dojo.getNinjas();
	}
}