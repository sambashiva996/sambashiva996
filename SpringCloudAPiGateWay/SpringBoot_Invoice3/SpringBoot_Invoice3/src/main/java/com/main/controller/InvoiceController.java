package com.main.controller;

import java.util.List;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.main.MyFeignClient;
import com.main.model.Invoice;
import com.main.service.InvoiceIntr;

@RequestMapping("/invoice")
@RestController
public class InvoiceController {

	@Autowired
	InvoiceIntr inter;
	/*
	 * @Autowired MyFeignClient feign;
	 */

	@PostMapping("/saveInvoice")
	public ResponseEntity<String> saveInvoice(@RequestBody Invoice invoice) {
		inter.saveInvoice(invoice);
		return new ResponseEntity<String>("Invoice created Successfully", HttpStatus.CREATED);
	}
	/*
	 * @PostMapping("/saveInvoice/{id}") public ResponseEntity<String>
	 * createInvoice(@PathVariable("orderid") int orderid) throws JSONException {
	 * Invoice invoice= new Invoice(); JSONObject orderDetails =
	 * feign.createInvoice(orderid); System.out.println(orderDetails);
	 * 
	 * int quantity = (int) orderDetails.get("quantity"); int
	 * price=orderDetails.getInt("price"); String
	 * order_status=orderDetails.getString("order_status"); if(quantity!=0) {
	 * 
	 * int totalamount=quantity*price; invoice.setTotalamount(totalamount);
	 * invoice.setPaymentstatus("paid");
	 * if(order_status.toLowerCase().equalsIgnoreCase("confirmed")) {
	 * inter.saveInvoice(invoice); }
	 * 
	 * }else { return new ResponseEntity<String>("order not confirmed",
	 * HttpStatus.NOT_FOUND); }
	 * 
	 * 
	 * return new ResponseEntity<String>("Invoice created Successfully",
	 * HttpStatus.CREATED); }
	 */

	@GetMapping("/getInvoice")
	public ResponseEntity<List<Invoice>> fetchData() {
		List<Invoice> list = inter.fetchInvoiceData();
		if (list.size() == 0) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<>(list, HttpStatus.OK);
	}
	
	@GetMapping("/invoice/{id}")
	public ResponseEntity<Invoice> getInvoiceById(@PathVariable("id") int id) {
	          Invoice list = inter.getInvoiceById(id);
		if (list != null) {
			return new ResponseEntity<>(list, HttpStatus.OK);
		}
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);

	}

}