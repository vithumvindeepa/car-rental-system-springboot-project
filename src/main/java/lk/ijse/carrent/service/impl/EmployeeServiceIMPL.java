package lk.ijse.carrent.service.impl;

import lk.ijse.carrent.dto.EmployeeDTO;
import lk.ijse.carrent.entity.Employee;
import lk.ijse.carrent.repo.EmployeeRepo;
import lk.ijse.carrent.service.EmployeeService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class EmployeeServiceIMPL implements EmployeeService {

    @Autowired
    private EmployeeRepo repo;

    @Autowired
    private ModelMapper map;

    @Override
    public void saveEmployee(EmployeeDTO dto) {

        if (!repo.existsById(dto.getEmployeeID())) {
            repo.save(map.map(dto, Employee.class));
        } else {
            throw new RuntimeException("This Employee ID id is already exists....!!!");
        }
    }

    @Override
    public void deleteEmployee(String id) {

        if (repo.existsById(id)) {
            repo.deleteById(id);
        } else {
            throw new RuntimeException("Please check the Employee ID.. No Such Employee..!");
        }
    }

    @Override
    public void updateEmployee(EmployeeDTO dto) {

        if (!repo.existsById(dto.getEmployeeID())) {
            repo.save(map.map(dto, Employee.class));
        } else {
            throw new RuntimeException("No Such Employee To Update..! Please Check the ID!");
        }
    }

    @Override
    public EmployeeDTO searchEmployee(String id) {

        if (repo.existsById(id)){
            return map.map(repo.findById(id).get(),EmployeeDTO.class);
        }else {
            throw new RuntimeException("No Employee For " + id + " ..!");
        }
    }

    @Override
    public List<EmployeeDTO> getAllEmployee() {

        return map.map(repo.findAll(), new TypeToken<List<EmployeeDTO>>() {
        }.getType());
    }

}
