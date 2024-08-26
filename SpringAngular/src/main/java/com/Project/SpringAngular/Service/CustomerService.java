package com.Project.SpringAngular.Service;

import com.Project.SpringAngular.DTO.CustomerSaveDTO;
import org.springframework.stereotype.Service;


@Service
public interface CustomerService {

    String addCustomer(CustomerSaveDTO customerSaveDTO);



}
