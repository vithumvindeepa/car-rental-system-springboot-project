package lk.ijse.carrent.service.impl;

import lk.ijse.carrent.dto.DriverDTO;
import lk.ijse.carrent.entity.Driver;
import lk.ijse.carrent.repo.DriverRepo;
import lk.ijse.carrent.service.DriverService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class DriverServiceIMPL implements DriverService {

    @Autowired
     DriverRepo repo;

    @Autowired
     ModelMapper map;

    @Override
    public void saveDriver(DriverDTO dto) {

        if (!repo.existsById(dto.getDriverID())) {
            repo.save(map.map(dto, Driver.class));
        } else {
            throw new RuntimeException("This Driver ID id is already exists....!!!");
        }
    }

    @Override
    public void deleteDriver(String id) {

        if (repo.existsById(id)) {
            repo.deleteById(id);
        } else {
            throw new RuntimeException("Please check the Driver ID.. No Such Driver..!");
        }
    }

    @Override
    public void updateDriver(DriverDTO dto) {

        if (!repo.existsById(dto.getDriverID())) {
            repo.save(map.map(dto, Driver.class));
        } else {
            throw new RuntimeException("No Such Driver To Update..! Please Check the ID!");
        }
    }

    @Override
    public DriverDTO searchDriver(String id) {

        if (repo.existsById(id)){
            return map.map(repo.findById(id).get(),DriverDTO.class);
        }else {
            throw new RuntimeException("No Driver For " + id + " ..!");
        }
    }

    @Override
    public List<DriverDTO> getAllDriver() {

        return map.map(repo.findAll(), new TypeToken<List<DriverDTO>>() {
        }.getType());
    }

}
