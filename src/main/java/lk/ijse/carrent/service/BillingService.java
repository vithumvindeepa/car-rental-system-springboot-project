package lk.ijse.carrent.service;

import lk.ijse.carrent.dto.Billingdto;

import java.util.List;

public interface BillingService {

void saveBilling(Billingdto dto);
void deleteBilling(String id);
void updateBilling(String id);
Billingdto searchBilling(String id);
    List<Billingdto> getAllBooking();

}
