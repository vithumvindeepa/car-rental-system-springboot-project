package lk.ijse.carrent.service.impl;

import lk.ijse.carrent.dto.EmployeeDTO;
import lk.ijse.carrent.entity.Employee;
import lk.ijse.carrent.repo.EmployeeRepo;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class EmployeeServiceIMPL {

    @Autowired
    private EmployeeRepo repo;

    @Autowired
    private ModelMapper map;

    public void saveEmployee(EmployeeDTO dto) {

        if (!repo.existsById(dto.getEmployeeID())) {
            repo.save(map.map(dto, Employee.class));
        } else {
            throw new RuntimeException("This Employee ID id is already exists....!!!");
        }
    }

    public void deleteEmployee(String id) {

        if (repo.existsById(id)) {
            repo.deleteById(id);
        } else {
            throw new RuntimeException("Please check the Employee ID.. No Such Employee..!");
        }
    }

    public void updateEmployee(EmployeeDTO dto) {

        if (!repo.existsById(dto.getEmployeeID())) {
            repo.save(map.map(dto, Employee.class));
        } else {
            throw new RuntimeException("No Such Employee To Update..! Please Check the ID!");
        }
    }

    public EmployeeDTO searchEmployee(String id) {

        if (repo.existsById(id)){
            return map.map(repo.findById(id).get(),EmployeeDTO.class);
        }else {
            throw new RuntimeException("No Employee For " + id + " ..!");
        }
    }

    public List<EmployeeDTO> getAllEmployee() {

        return map.map(repo.findAll(), new TypeToken<List<EmployeeDTO>>() {
        }.getType());
    }

}
