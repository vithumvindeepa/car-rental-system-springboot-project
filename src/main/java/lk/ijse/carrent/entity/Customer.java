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

public class Customer {

    @Id
   private String CustomerID;
    private String Name;
    private int ContactNo;
    private int DrivingLicenceNo;
    private String City;
}
