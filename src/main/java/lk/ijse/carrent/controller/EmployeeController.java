package lk.ijse.carrent.controller;

import lk.ijse.carrent.dto.EmployeeDTO;
import lk.ijse.carrent.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import util.ResponceUtil;

@RestController
@RequestMapping("Employee")
@CrossOrigin

public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponceUtil SaveEmployee(EmployeeDTO employeedto) {
        employeeService.saveEmployee(employeedto);
        return new ResponceUtil(200, "save", null);

    }

    @DeleteMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponceUtil DeleteEmployee(@RequestParam String iD) {
        employeeService.deleteEmployee(iD);
        return new ResponceUtil(200, "delete", null);
    }





}
