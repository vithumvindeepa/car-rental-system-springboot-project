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

public class Billing {
    @Id
    String BillID;
    String BookingID;
    String BillDate;
    double AmountBalance;
    double AdvanceAmount;
    double DamageCost;

}
