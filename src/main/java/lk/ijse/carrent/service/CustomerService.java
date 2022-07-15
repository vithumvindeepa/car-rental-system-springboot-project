package lk.ijse.carrent.service;

import lk.ijse.carrent.dto.CustomerDTO;

import java.util.List;

public interface CustomerService {

    void saveCustomer(CustomerDTO dto);

    void deleteCustomer(String id);

    void updateCustomer(CustomerDTO dto);

    CustomerDTO searchCustomer(String id);

    List<CustomerDTO> getAllCustomer();
}
