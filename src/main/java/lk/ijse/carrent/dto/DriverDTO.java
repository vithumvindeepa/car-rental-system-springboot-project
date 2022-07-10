package lk.ijse.carrent.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data

public class DriverDTO {

    String DriverID;
    String DriverName;
    int ContactNo;
    String Email;
    int DrivingLicenceNo;

}
