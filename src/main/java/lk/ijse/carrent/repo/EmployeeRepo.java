package lk.ijse.carrent.repo;


import lk.ijse.carrent.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EmployeeRepo extends JpaRepository<Employee,String> {

}
