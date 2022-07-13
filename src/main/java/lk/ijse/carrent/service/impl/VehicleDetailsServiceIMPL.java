package lk.ijse.carrent.service.impl;

import lk.ijse.carrent.repo.VehicleDetailsRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

public class VehicleDetailsServiceIMPL {

    @Autowired
    private VehicleDetailsRepo repo;

    @Autowired
    private ModelMapper map;
}
