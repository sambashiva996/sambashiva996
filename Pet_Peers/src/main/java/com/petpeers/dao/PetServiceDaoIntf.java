package com.petpeers.dao;

import java.util.List;

import com.petpeers.model.Pets;
import com.petpeers.model.PetSold;

public interface PetServiceDaoIntf {

	List<Pets> getPetList(int userid);

	void savePetDetails(Pets pet,int userid);

	List<Pets> getPetSoldList(int userid);

	List<Pets> getBuyOrSold(int petId);

	void saveSoldPetDetails(PetSold petSold);

	void updateSoldPet(int getsPetSold);


}
