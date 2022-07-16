package lk.ijse.carrent.service;

import lk.ijse.carrent.dto.BillingDTO;

import java.util.List;

public interface BillingService {

    void saveBilling(BillingDTO dto);

    void deleteBilling(String id);

    void updateBilling(BillingDTO dto);

    BillingDTO searchBilling(String id);

    List<BillingDTO> getAllBooking();

}
