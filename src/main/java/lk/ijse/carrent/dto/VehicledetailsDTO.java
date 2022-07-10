package lk.ijse.carrent.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data

public class VehicledetailsDTO {

String VehicleID;
String Model;
String VehiclePhoto;
String VehicleColor;
double DailyPrice;
String Mileage;
}
