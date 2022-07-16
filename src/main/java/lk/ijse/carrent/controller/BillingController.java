package lk.ijse.carrent.controller;

import lk.ijse.carrent.dto.BillingDTO;
import lk.ijse.carrent.service.BillingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import util.ResponceUtil;

@RestController
@RequestMapping("Billing")
@CrossOrigin

public class BillingController {
    @Autowired
    BillingService billingService;

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponceUtil SaveBilling(BillingDTO billingdto) {
        billingService.saveBilling(billingdto);
        return new ResponceUtil(200, "save", null);

    }

    @DeleteMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponceUtil DeleteBilling(@RequestParam String iD) {
        billingService.deleteBilling(iD);
        return new ResponceUtil(200, "delete", null);
    }



}
