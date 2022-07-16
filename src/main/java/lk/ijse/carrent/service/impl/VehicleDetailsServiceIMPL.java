package lk.ijse.carrent.service.impl;

import lk.ijse.carrent.dto.VehicledetailsDTO;
import lk.ijse.carrent.entity.Vehicledetails;
import lk.ijse.carrent.repo.VehicleDetailsRepo;
import lk.ijse.carrent.service.VehicleDetailsService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class VehicleDetailsServiceIMPL implements VehicleDetailsService {

    @Autowired
    private VehicleDetailsRepo repo;

    @Autowired
    private ModelMapper map;

    @Override
    public void saveVehicleDetails(VehicledetailsDTO dto) {

        if (!repo.existsById(dto.getVehicleID())) {
            repo.save(map.map(dto, Vehicledetails.class));
        } else {
            throw new RuntimeException("This VehicleDetails ID id is already exists....!!!");
        }
    }

    @Override
    public void deleteVehicleDetails(String id) {

        if (repo.existsById(id)) {
            repo.deleteById(id);
        } else {
            throw new RuntimeException("Please check the VehicleDetails ID.. No Such VehicleDetails..!");
        }
    }

    @Override
    public void updateVehicleDetails(VehicledetailsDTO dto) {

        if (!repo.existsById(dto.getVehicleID())) {
            repo.save(map.map(dto, Vehicledetails.class));
        } else {
            throw new RuntimeException("No Such VehicleDetails To Update..! Please Check the ID!");
        }
    }

    @Override
    public VehicledetailsDTO searchVehicleDetails(String id) {

        if (repo.existsById(id)){
            return map.map(repo.findById(id).get(),VehicledetailsDTO.class);
        }else {
            throw new RuntimeException("No VehicleDetails For " + id + " ..!");
        }
    }

    @Override
    public List<VehicledetailsDTO> getAllVehicleDetails() {

        return map.map(repo.findAll(), new TypeToken<List<VehicledetailsDTO>>() {
        }.getType());
    }

}
