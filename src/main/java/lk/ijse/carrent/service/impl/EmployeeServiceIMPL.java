package lk.ijse.carrent.service.impl;

import lk.ijse.carrent.repo.EmployeeRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

public class EmployeeServiceIMPL {

    @Autowired
    private EmployeeRepo repo;

    @Autowired
    private ModelMapper map;
}
