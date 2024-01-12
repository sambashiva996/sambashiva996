package com.main.service;

import java.util.List;

import org.codehaus.jettison.json.JSONObject;

import com.main.model.Invoice;

public interface InvoiceIntr {

	void saveInvoice(Invoice invoice);

	List<Invoice> fetchInvoiceData();

	Invoice getInvoiceById(int id);



}
