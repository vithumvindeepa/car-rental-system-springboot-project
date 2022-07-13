package lk.ijse.carrent.service.impl;

import lk.ijse.carrent.repo.DriverRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

public class DriverServiceIMPL {

    @Autowired
    private DriverRepo repo;

    @Autowired
    private ModelMapper map;
}
