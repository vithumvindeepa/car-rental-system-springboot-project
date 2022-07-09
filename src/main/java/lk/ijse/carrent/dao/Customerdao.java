package lk.ijse.carrent.dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data

public class Customerdao {

    String CustomerID;
    String Name;
    int ContactNo;
    int DrivingLicenceNo;
    String City;
}
