package lk.ijse.carrent.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data

public class Bookingdto {

String BookingID;
String Date;
String PickupLocation;
double AdvanceAmount;
String VehiclePlateNo;
String CustomerName;

}
