package lk.ijse.carrent.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data

public class Customerdto {

    String CustomerID;
    String Name;
    int ContactNo;
    int DrivingLicenceNo;
    String City;
}
