package com.springcloudapiinvoiceservice.service;

import java.util.List;
import java.util.Optional;

import com.springcloudapiinvoiceservice.model.Invoice;

public interface InvoiceServiceIntf {

	void createInvoice(Invoice invoice);

	List<Invoice> fetchInvoices();

	Optional<Invoice> invoiceById(int invoiceId);

}
