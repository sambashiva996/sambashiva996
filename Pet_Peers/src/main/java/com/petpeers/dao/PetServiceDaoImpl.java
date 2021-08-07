package com.petpeers.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.petpeers.model.Pets;
import com.petpeers.model.PetSold;

@Repository
public class PetServiceDaoImpl implements PetServiceDaoIntf{

	@Autowired
	SessionFactory sessionFactory;
	
	public List<Pets> getPetList(int userid) {
		
		Query petList = sessionFactory.openSession().createSQLQuery("select * from tbl_pets where user_id=:userid").addEntity(Pets.class);
		      petList.setParameter("userid",userid);
		List<Pets> listOfPet = petList.list();
		return listOfPet;
	}
	
	public void savePetDetails(Pets pet,int userid) {

	sessionFactory.openSession().save(pet);
	
	int petId = pet.getPetId();
	SQLQuery updateUserId = sessionFactory.openSession().createSQLQuery("update tbl_pets set user_id=:userid where petid=:petId");
	updateUserId.setParameter("userid",userid);
	updateUserId.setParameter("petId",petId);
	updateUserId.executeUpdate();
	}

	public List<Pets> getPetSoldList(int userid) {
		Query petLst = sessionFactory.openSession().createSQLQuery("select * from tbl_pets where pet_buy_or_sold=:sold and user_id=:userid").addEntity(Pets.class);
		      petLst.setParameter("sold", "sold");
		      petLst.setParameter("userid",userid);
		List<Pets> petSoldList = petLst.list();
		return petSoldList;
	}

	
	public List<Pets> getBuyOrSold(int petId) {
		Query buySold = sessionFactory.openSession().createQuery("from Pets s where s.petId=:petId");
		     buySold.setParameter("petId", petId);
		List<Pets> listOfPet = buySold.list();
		return listOfPet;
	}

	public void saveSoldPetDetails(PetSold petSold) {
               sessionFactory.openSession().save(petSold);	
	}

	
	public void updateSoldPet(int getsPetSold) {
		Query updateQry = sessionFactory.openSession().createQuery("update Pets p set p.petBuyOrSold=:getsPetSold where p.petId=:petSold");
		updateQry.setParameter("getsPetSold","Sold");
		updateQry.setParameter("petSold",getsPetSold);
		updateQry.executeUpdate();
	}

}
