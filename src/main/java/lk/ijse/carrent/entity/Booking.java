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

public class Booking {
    @Id
    String BookingID;
    String Date;
    String PickupLocation;
    double AdvanceAmount;
    String VehiclePlateNo;
    String CustomerName;

}
