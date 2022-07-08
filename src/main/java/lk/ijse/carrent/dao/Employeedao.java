package lk.ijse.carrent.dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data

public class Employeedao {
String EmployeeID;
String Name;
int ContactNo;
String Email;
String EmployeeType;
double Salary;

}
