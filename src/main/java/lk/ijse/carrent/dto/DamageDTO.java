package lk.ijse.carrent.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data

public class DamageDTO {

String DamageID;
String VehicleID;
String VehiclePlateNo;
String DamageType;
String VehiclePhoto;
String Model;

}
