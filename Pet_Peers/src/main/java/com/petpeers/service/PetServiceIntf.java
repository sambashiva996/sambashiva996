package com.petpeers.service;

import java.util.List;

import com.petpeers.model.Pets;
import com.petpeers.model.PetSold;

public interface PetServiceIntf {

	List<Pets> getPetList(int userid);

	void savePetDetails(Pets pet, int userid);

	List<Pets> getMyPetSoldList(int userid);

	List<Pets> getBuyOrSold(int petId);

	void saveSoldPetDetails(PetSold petSold);

	void updateSoldPet(int getsPetSold);
}
