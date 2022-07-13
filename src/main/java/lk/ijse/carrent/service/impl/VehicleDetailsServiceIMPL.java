package lk.ijse.carrent.service.impl;

import lk.ijse.carrent.dto.VehicledetailsDTO;
import lk.ijse.carrent.entity.Vehicledetails;
import lk.ijse.carrent.repo.VehicleDetailsRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

public class VehicleDetailsServiceIMPL {

    @Autowired
    private VehicleDetailsRepo repo;

    @Autowired
    private ModelMapper map;

    public void saveVehicleDetails(VehicledetailsDTO dto) {

        if (!repo.existsById(dto.getVehicleID())) {
            repo.save(map.map(dto, Vehicledetails.class));
        } else {
            throw new RuntimeException("This VehicleDetails ID id is already exists....!!!");
        }
    }

    public void deleteVehicleDetails(String id) {

        if (repo.existsById(id)) {
            repo.deleteById(id);
        } else {
            throw new RuntimeException("Please check the VehicleDetails ID.. No Such VehicleDetails..!");
        }
    }

    public void updateVehicleDetails(VehicledetailsDTO dto) {

        if (!repo.existsById(dto.getVehicleID())) {
            repo.save(map.map(dto, Vehicledetails.class));
        } else {
            throw new RuntimeException("No Such VehicleDetails To Update..! Please Check the ID!");
        }
    }



}
