package lk.ijse.carrent.controller;

import lk.ijse.carrent.dto.DriverDTO;
import lk.ijse.carrent.service.DriverService;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import util.ResponceUtil;

@RestController
@RequestMapping("Driver")
@CrossOrigin

public class DriverController {
    @Autowired
    DriverService driverService;

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponceUtil SaveDriver(DriverDTO driverDTO) {
        driverService.saveDriver(driverDTO);
        return new ResponceUtil(200, "save", null);

    }

    @DeleteMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponceUtil DeleteDriver(@RequestParam String iD) {
        driverService.deleteDriver(iD);
        return new ResponceUtil(200, "delete", null);
    }

    @PutMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponceUtil updateDriver(@RequestBody DriverDTO driverDTO) {
        driverService.updateDriver(driverDTO);
        return new ResponceUtil(200, "update", null);
    }

    @GetMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponceUtil SearchDriver(@PathVariable String iD) {
        return new ResponceUtil(200, "search", driverService.searchDriver(iD));
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponceUtil getAllDriver() {
        return new ResponceUtil(200, "all", driverService.getAllDriver());
    }

}
