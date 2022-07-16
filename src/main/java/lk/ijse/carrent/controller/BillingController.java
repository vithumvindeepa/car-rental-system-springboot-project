package lk.ijse.carrent.controller;

import lk.ijse.carrent.dto.BillingDTO;
import lk.ijse.carrent.dto.CustomerDTO;
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
    public ResponceUtil SaveBilling(BillingDTO billingDTO) {
        billingService.saveBilling(billingDTO);
        return new ResponceUtil(200, "save", null);

    }

    @DeleteMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponceUtil DeleteBilling(@RequestParam String iD) {
        billingService.deleteBilling(iD);
        return new ResponceUtil(200, "delete", null);
    }

    @PutMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponceUtil updateBilling(@RequestBody BillingDTO billingDTO) {
        billingService.updateBilling(billingDTO);
        return new ResponceUtil(200, "update", null);
    }

    @GetMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponceUtil SearchBilling(@PathVariable String iD) {
        return new ResponceUtil(200, "search", billingService.searchBilling(iD));
    }



}
