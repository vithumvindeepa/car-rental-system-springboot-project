package lk.ijse.carrent.service.impl;

import lk.ijse.carrent.dto.CustomerDTO;
import lk.ijse.carrent.entity.Customer;
import lk.ijse.carrent.repo.CustomerRepo;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

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

    public CustomerDTO searchCustomer(String id) {

        if (repo.existsById(id)){
            return map.map(repo.findById(id).get(),CustomerDTO.class);
        }else {
            throw new RuntimeException("No Customer For " + id + " ..!");
        }
    }

    public List<CustomerDTO> getAllCustomer() {

        return map.map(repo.findAll(), new TypeToken<List<CustomerDTO>>() {
        }.getType());
    }

}
