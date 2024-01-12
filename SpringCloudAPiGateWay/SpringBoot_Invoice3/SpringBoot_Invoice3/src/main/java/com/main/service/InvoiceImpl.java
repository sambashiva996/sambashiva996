package com.main.service;

import java.util.List;

import org.codehaus.jettison.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.main.model.Invoice;
import com.main.repository.InvoiceRepo;
@Transactional
@Service
public class InvoiceImpl implements InvoiceIntr{

	@Autowired
	InvoiceRepo repo;
	
	public void saveInvoice(Invoice invoice) {
		repo.save(invoice);
		
	}
	public List<Invoice> fetchInvoiceData() {
		
		return repo.findAll();
	}
	
	public Invoice getInvoiceById(int id) {
		return repo.findById(id).get();
	}

	
}
