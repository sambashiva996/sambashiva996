package com.main;

 



import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

 

@FeignClient(value="eureka-client-2")
public interface MyFeignClient {
    
    @GetMapping("/")
    String client3Response();
    
    
    /*
     * //JSONObject getOneOrderById(@PathVariable("id") int id);
     * 
     * @GetMapping("/order/{id}") JSONObject createInvoice(int orderid);
     */
}