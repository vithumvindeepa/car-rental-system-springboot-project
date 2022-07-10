package lk.ijse.carrent.service;

import lk.ijse.carrent.dto.DriverDTO;

import java.util.List;

public interface DriverService {

    void saveDriver(DriverDTO dto);

    void deleteDriver(String id);

    void updateDriver(String dto);

    DriverDTO searchDriver(String id);

    List<DriverDTO> getAllDriver();
}
