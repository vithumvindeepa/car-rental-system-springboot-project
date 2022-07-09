package lk.ijse.carrent.dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data

public class Vehicledetailsdao {

String VehicleID;
String Model;
String VehiclePhoto;
String VehicleColor;
double DailyPrice;
String Mileage;

}
