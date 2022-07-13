package lk.ijse.carrent.service.impl;

import lk.ijse.carrent.dto.BillingDTO;
import lk.ijse.carrent.dto.CustomerDTO;
import lk.ijse.carrent.entity.Billing;
import lk.ijse.carrent.entity.Customer;
import lk.ijse.carrent.repo.CustomerRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

public class CustomerServiceIMPL {

    @Autowired
    private CustomerRepo repo;

    @Autowired
    private ModelMapper map;

    public void saveCustomer(CustomerDTO dto) {

        if (!repo.existsById(dto.getCustomerID())) {
            repo.save(map.map(dto, Customer.class));
        } else {
            throw new RuntimeException("This Customer ID id is already exists....!!!");
        }
    }

    public void deleteCustomer(String id) {

        if (repo.existsById(id)) {
            repo.deleteById(id);
        } else {
            throw new RuntimeException("Please check the Customer ID.. No Such Customer..!");
        }
    }

    public void updateCustomer(CustomerDTO dto) {

        if (!repo.existsById(dto.getCustomerID())) {
            repo.save(map.map(dto, Customer.class));
        } else {
            throw new RuntimeException("No Such Customer To Update..! Please Check the ID!");
        }
    }


}
