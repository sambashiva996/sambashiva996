package com.springcloudapiinvoiceservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springcloudapiinvoiceservice.dao.InvoiceRepository;
import com.springcloudapiinvoiceservice.model.Invoice;

@Service
@Transactional
public class InvoiceServiceImpl implements InvoiceServiceIntf{

	@Autowired
	InvoiceRepository invoiceRepository;
	
	public void createInvoice(Invoice invoice) {
		invoiceRepository.save(invoice);
	}

	public List<Invoice> fetchInvoices() {
		return invoiceRepository.findAll();
	}

	public Optional<Invoice> invoiceById(int invoiceId) {
		return invoiceRepository.findById(invoiceId);
	}

}
