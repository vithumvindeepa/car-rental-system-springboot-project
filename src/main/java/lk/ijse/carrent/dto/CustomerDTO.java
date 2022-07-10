package lk.ijse.carrent.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data

public class CustomerDTO {

    String CustomerID;
    String Name;
    int ContactNo;
    int DrivingLicenceNo;
    String City;
}
