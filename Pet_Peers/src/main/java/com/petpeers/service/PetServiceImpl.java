package com.petpeers.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.petpeers.dao.PetServiceDaoIntf;
import com.petpeers.model.Pets;
import com.petpeers.model.PetSold;

@Service
@Transactional
public class PetServiceImpl implements PetServiceIntf{

	@Autowired
	PetServiceDaoIntf petServiceDaoIntf;
	
	public List<Pets> getPetList(int userid) {
		return petServiceDaoIntf.getPetList(userid);
	}

	public void savePetDetails(Pets pet,int userid) {
		petServiceDaoIntf.savePetDetails(pet,userid);
	}

	public List<Pets> getMyPetSoldList(int userid) {
		return petServiceDaoIntf.getPetSoldList(userid);

	}

	public List<Pets> getBuyOrSold(int petId) {
		return petServiceDaoIntf.getBuyOrSold(petId);

	}

	
	public void saveSoldPetDetails(PetSold petSold) {
		petServiceDaoIntf.saveSoldPetDetails(petSold);
	}

	public void updateSoldPet(int getsPetSold) {
		petServiceDaoIntf.updateSoldPet(getsPetSold);
	}
}
