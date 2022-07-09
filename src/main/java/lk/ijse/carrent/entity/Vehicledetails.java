package lk.ijse.carrent.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
@Entity

public class Vehicledetails {
    @Id
    String VehicleID;
    String Model;
    String VehiclePhoto;
    String VehicleColor;
    double DailyPrice;
    String Mileage;
}
