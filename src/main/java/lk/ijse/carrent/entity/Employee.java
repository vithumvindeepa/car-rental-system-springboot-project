package lk.ijse.carrent.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
@Entity

public class Employee {
    @Id
    String EmployeeID;
    String Name;
    int ContactNo;
    String Email;
    String EmployeeType;
    double Salary;
}
