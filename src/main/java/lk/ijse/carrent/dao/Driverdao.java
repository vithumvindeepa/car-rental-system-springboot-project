package lk.ijse.carrent.dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data

public class Driverdao {

    String DriverID;
    String DriverName;
    int ContactNo;
    String Email;
    int DrivingLicenceNo;

}
