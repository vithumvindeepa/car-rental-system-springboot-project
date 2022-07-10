package lk.ijse.carrent.service;

import lk.ijse.carrent.dto.BillingDTO;
import lk.ijse.carrent.dto.EmployeeDTO;

import java.util.List;

public interface EmployeeService {

    void saveEmployee(EmployeeDTO dto);

    void deleteEmployee(String id);

    void updateEmployee(String dto);

    EmployeeDTO searchEmployee(String id);

    List<EmployeeDTO> getAllEmployee();
}
