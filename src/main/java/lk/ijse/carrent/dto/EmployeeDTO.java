package lk.ijse.carrent.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data

public class EmployeeDTO {

String EmployeeID;
String Name;
int ContactNo;
String Email;
String EmployeeType;
double Salary;

}
