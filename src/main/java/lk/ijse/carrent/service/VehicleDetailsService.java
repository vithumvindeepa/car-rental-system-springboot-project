package lk.ijse.carrent.service;

import lk.ijse.carrent.dto.BillingDTO;
import lk.ijse.carrent.dto.VehicledetailsDTO;

import java.util.List;

public interface VehicleDetailsService {

    void saveVehicleDetails(VehicledetailsDTO dto);

    void deleteVehicleDetails(String id);

    void updateVehicleDetails(String dto);

    VehicledetailsDTO searchVehicleDetails(String id);

    List<VehicledetailsDTO> getAllVehicleDetails();
}
