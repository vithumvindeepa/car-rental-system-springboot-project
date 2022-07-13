package lk.ijse.carrent.service.impl;

import lk.ijse.carrent.repo.DamageRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

public class DamageServiceIMPL {

    @Autowired
    private DamageRepo repo;

    @Autowired
    private ModelMapper map;
}
