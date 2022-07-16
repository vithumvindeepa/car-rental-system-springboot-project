package lk.ijse.carrent.controller;

import lk.ijse.carrent.dto.CustomerDTO;
import lk.ijse.carrent.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import util.ResponceUtil;


@RestController
@RequestMapping("Customer")
@CrossOrigin

public class CustomerController {
    @Autowired
CustomerService customerService;

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponceUtil SaveCustomer(CustomerDTO customerdto) {
        customerService.saveCustomer(customerdto);
        return new ResponceUtil(200, "save", null);

    }

    @DeleteMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponceUtil DeleteCustomer(@RequestParam String iD) {
        customerService.deleteCustomer(iD);
        return new ResponceUtil(200, "delete", null);
    }

    @PutMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponceUtil updateCustomer(@RequestBody CustomerDTO customerdto) {
        customerService.updateCustomer(customerdto);
        return new ResponceUtil(200, "update", null);
    }


    @GetMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponceUtil SearchCustomer(@PathVariable String iD) {
        return new ResponceUtil(200, "search", customerService.searchCustomer(iD));
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponceUtil getAllCustomer() {
        System.out.println("dulanjana");
        return new ResponceUtil(200, "all", customerService.getAllCustomer());
    }



}
