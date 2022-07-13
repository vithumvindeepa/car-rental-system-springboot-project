package lk.ijse.carrent.service.impl;

import lk.ijse.carrent.repo.CustomerRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

public class CustomerServiceIMPL {

    @Autowired
    private CustomerRepo repo;

    @Autowired
    private ModelMapper map;
}
