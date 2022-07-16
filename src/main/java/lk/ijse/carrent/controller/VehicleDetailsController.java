package lk.ijse.carrent.controller;

import lk.ijse.carrent.dto.CustomerDTO;
import lk.ijse.carrent.dto.VehicledetailsDTO;
import lk.ijse.carrent.service.VehicleDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
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

    @DeleteMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponceUtil DeleteVehicleDetails(@RequestParam String iD) {
        vehicleDetailsService.deleteVehicleDetails(iD);
        return new ResponceUtil(200, "delete", null);
    }

    @PutMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponceUtil updateVehicleDetails(@RequestBody VehicledetailsDTO vehicledetailsDTO) {
        vehicleDetailsService.updateVehicleDetails(vehicledetailsDTO);
        return new ResponceUtil(200, "update", null);
    }

    @GetMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponceUtil SearchVehicleDetails(@PathVariable String iD) {
        return new ResponceUtil(200, "search", vehicleDetailsService.searchVehicleDetails(iD));
    }



}
