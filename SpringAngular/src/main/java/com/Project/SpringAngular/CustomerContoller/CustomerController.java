package com.Project.SpringAngular.CustomerContoller;
import com.Project.SpringAngular.DTO.CustomerSaveDTO;
import com.Project.SpringAngular.Service.CustomerService;


import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("api/v1/customer")


public class CustomerController
{
private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping(path="/save")
    public String saveCustomer(@RequestBody CustomerSaveDTO  customerSaveDTO){
        return customerService.addCustomer(customerSaveDTO);

    }


}
