package lk.ijse.carrent.service.impl;

import lk.ijse.carrent.dto.BillingDTO;
import lk.ijse.carrent.dto.DriverDTO;
import lk.ijse.carrent.entity.Billing;
import lk.ijse.carrent.entity.Driver;
import lk.ijse.carrent.repo.DriverRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

public class DriverServiceIMPL {

    @Autowired
    private DriverRepo repo;

    @Autowired
    private ModelMapper map;

    public void saveDriver(DriverDTO dto) {

        if (!repo.existsById(dto.getDriverID())) {
            repo.save(map.map(dto, Driver.class));
        } else {
            throw new RuntimeException("This Driver ID id is already exists....!!!");
        }
    }

    public void deleteDriver(String id) {

        if (repo.existsById(id)) {
            repo.deleteById(id);
        } else {
            throw new RuntimeException("Please check the Driver ID.. No Such Driver..!");
        }
    }

    public void updateDriver(DriverDTO dto) {

        if (!repo.existsById(dto.getDriverID())) {
            repo.save(map.map(dto, Driver.class));
        } else {
            throw new RuntimeException("No Such Driver To Update..! Please Check the ID!");
        }
    }

    public DriverDTO searchDriver(String id) {

        if (repo.existsById(id)){
            return map.map(repo.findById(id).get(),DriverDTO.class);
        }else {
            throw new RuntimeException("No Driver For " + id + " ..!");
        }
    }



}
