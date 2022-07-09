package lk.ijse.carrent.dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data

public class Billingdao {

String BillID;
String BookingID;
String BillDate;
double AmountBalance;
double AdvanceAmount;
double DamageCost;

}
