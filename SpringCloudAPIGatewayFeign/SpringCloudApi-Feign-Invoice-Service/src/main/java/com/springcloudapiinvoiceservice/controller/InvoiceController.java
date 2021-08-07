package com.springcloudapiinvoiceservice.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springcloudapiinvoiceservice.feign.InvoiceFeignIntf;
import com.springcloudapiinvoiceservice.model.Invoice;
import com.springcloudapiinvoiceservice.model.Order;
import com.springcloudapiinvoiceservice.model.Product;
import com.springcloudapiinvoiceservice.service.InvoiceServiceIntf;

@RestController
@RequestMapping("/invoice")
public class InvoiceController {

	@Autowired
	InvoiceServiceIntf invoiceServiceIntf;
	@Autowired
	InvoiceFeignIntf invoiceFeignIntf;
	
	@PostMapping("/createInvoice/{orderId}")
	public ResponseEntity<String> createInvoice(@PathVariable("orderId") int orderId) throws JSONException{
		System.out.println("orderId=="+orderId);
			 Invoice invoice = new Invoice();
			 
			 ArrayList orderDetails = invoiceFeignIntf.getOrderDetails(orderId);
			 
		 System.out.println("orderDetails=="+orderDetails);
		 
		 double productPrice = (double) orderDetails.get(0);
		 int productQuantity = (int) orderDetails.get(1);
		 String orderStatus = (String) orderDetails.get(2);
		 int orderId2 = (int)orderDetails.get(3);
//		 int productQuantity  = (int)orderDetails.get("productQuantity");
//		 double productPrice = (double)orderDetails.get("productPrice");
//		 String orderStatus = (String)orderDetails.get("orderStatus");
		 
		 System.out.println("productQuantity=="+productQuantity+"productPrice=="+productPrice+"orderStatus=="+orderStatus);
		 if(productQuantity !=0) {
			 double totalAmount = productQuantity*productPrice;
			 invoice.setTotalAmount(totalAmount);
			 invoice.setPaymentStatus("paid");
			 invoice.setOrderId(orderId2);
			 
			 
			 if(orderStatus.toLowerCase().equals("confirmed")) {
					invoiceServiceIntf.createInvoice(invoice);
return new ResponseEntity<String>("invoice created successfully",HttpStatus.CREATED);

			 }
		 }
			return new ResponseEntity<String>("Order is Not Confirmed",HttpStatus.NOT_FOUND);

		}
	
	@PostMapping("/createInvoice")
	public ResponseEntity<String> createInvoice(@RequestBody Invoice invoice){
	                            
		invoiceServiceIntf.createInvoice(invoice);
		
		return new ResponseEntity<String>("invoice created successfully",HttpStatus.CREATED);
	}
	
	@GetMapping("/fetchInvoices")
	public ResponseEntity<List<Invoice>> fetchInvoices(){
		
		List<Invoice> fetchInvoices = invoiceServiceIntf.fetchInvoices();
		
		if(fetchInvoices.isEmpty()) {
			return new ResponseEntity<List<Invoice>>(HttpStatus.NO_CONTENT);
		}
		
		return new ResponseEntity<List<Invoice>>(fetchInvoices,HttpStatus.OK);
	}
	
	@GetMapping("/invoice/{invoiceId}")
	public ResponseEntity<Optional<Invoice>> invoiceById(@PathVariable("invoiceId") int invoiceId){
		
		Optional<Invoice> invoiceById = invoiceServiceIntf.invoiceById(invoiceId);
		System.out.println("invoiceById=="+invoiceById);
		if(invoiceById.isPresent()) {
			return new ResponseEntity<Optional<Invoice>>(invoiceById,HttpStatus.OK);
		}
		
		return new ResponseEntity<Optional<Invoice>>(HttpStatus.NO_CONTENT);
	}
	
}
