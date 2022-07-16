package lk.ijse.carrent.controller;

import lk.ijse.carrent.dto.CustomerDTO;
import lk.ijse.carrent.dto.VehicledetailsDTO;
import lk.ijse.carrent.service.VehicleDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import util.ResponceUtil;

@RestController
@RequestMapping("VehicleDetails")
@CrossOrigin

public class VehicleDetailsController {
    @Autowired
    VehicleDetailsService vehicleDetailsService;

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponceUtil SaveVehicleDetails(VehicledetailsDTO vehicledetailsDTO) {
        vehicleDetailsService.saveVehicleDetails(vehicledetailsDTO);
        return new ResponceUtil(200, "save", null);

    }





}
