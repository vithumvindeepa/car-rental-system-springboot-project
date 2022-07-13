package lk.ijse.carrent.service.impl;

import lk.ijse.carrent.dto.BillingDTO;
import lk.ijse.carrent.dto.EmployeeDTO;
import lk.ijse.carrent.entity.Billing;
import lk.ijse.carrent.entity.Employee;
import lk.ijse.carrent.repo.EmployeeRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

public class EmployeeServiceIMPL {

    @Autowired
    private EmployeeRepo repo;

    @Autowired
    private ModelMapper map;

    public void saveEmployee(EmployeeDTO dto) {

        if (!repo.existsById(dto.getEmployeeID())) {
            repo.save(map.map(dto, Employee.class));
        } else {
            throw new RuntimeException("This Employee ID id is already exists....!!!");
        }
    }


}
