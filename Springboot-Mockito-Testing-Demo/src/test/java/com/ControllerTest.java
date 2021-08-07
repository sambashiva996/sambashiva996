package com;

import static org.hamcrest.CoreMatchers.any;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.controller.AccountController;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.Module.SetupContext;
import com.model.Account;
import com.service.AccountServiceImpl;
import com.service.AccountServiceIntf;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ControllerTest {

	@Autowired
	WebApplicationContext context;
    @Autowired
    AccountController accountController;
    @MockBean
    AccountServiceIntf accountServiceIntf;
    
    private MockMvc mvc;
    
    @Before
    public void setUp() {
    	MockitoAnnotations.initMocks(this);//enable mockito annotaions
    	mvc = MockMvcBuilders.webAppContextSetup(context).build();//all controllers end points or specific end point	
    }
	
//    @Test
//    public void createAccount() throws Exception {
//      this.mvc.perform(post("/account/saveAccount").contentType(MediaType.APPLICATION_JSON)
//        .content("{\"accId\":\"123\",\"balance\":1000}")).andExpect(status().isCreated());
//    }
	@Test
	public void saveAccount() throws JsonProcessingException, Exception {
		
     Account account = new Account(5,4567);
     // below code if data is store in db then we mock 
		Mockito.when(accountServiceIntf.saveAccount(Mockito.any(Account.class))).thenReturn(account);

     
		mvc.perform(post("/account/saveAccount")
				 .contentType(MediaType.APPLICATION_JSON)
				 .content(asJsonString(account)))
		         .andExpect(status()
				.isCreated());
	}

	public String asJsonString(Object obj) throws JsonProcessingException {
		ObjectMapper objectMapper = new ObjectMapper();
		
		return objectMapper.writeValueAsString(obj);
	}
}
