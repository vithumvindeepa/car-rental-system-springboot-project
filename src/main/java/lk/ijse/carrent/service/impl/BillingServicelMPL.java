package lk.ijse.carrent.service.impl;

import lk.ijse.carrent.dto.BillingDTO;
import lk.ijse.carrent.entity.Billing;
import lk.ijse.carrent.repo.BillingRepo;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BillingServicelMPL {

    @Autowired
    private BillingRepo repo;

    @Autowired
    private ModelMapper map;

    public void saveBilling(BillingDTO dto) {

        if (!repo.existsById(dto.getBillID())) {
            repo.save(map.map(dto, Billing.class));
        } else {
            throw new RuntimeException("This Billing ID id is already exists....!!!");
        }
    }

    public void deleteBilling(String id) {

        if (repo.existsById(id)) {
            repo.deleteById(id);
        } else {
            throw new RuntimeException("Please check the Billing ID.. No Such Billing..!");
        }
    }

    public void updateBilling(BillingDTO dto) {

        if (repo.existsById(dto.getBillID())) {
            repo.save(map.map(dto, Billing.class));
        } else {
            throw new RuntimeException("No Such Billing To Update..! Please Check the ID!");
        }
    }

    public BillingDTO searchBilling(String id) {

        if (repo.existsById(id)){
            return map.map(repo.findById(id).get(),BillingDTO.class);
        }else {
            throw new RuntimeException("No Billing For " + id + " ..!");
        }
    }

    public List<BillingDTO> getAllBilling() {

        return map.map(repo.findAll(), new TypeToken<List<BillingDTO>>() {
        }.getType());
    }
}
