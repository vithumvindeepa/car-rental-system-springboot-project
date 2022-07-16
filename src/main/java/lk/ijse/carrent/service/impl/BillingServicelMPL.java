package lk.ijse.carrent.service.impl;

import lk.ijse.carrent.dto.BillingDTO;
import lk.ijse.carrent.entity.Billing;
import lk.ijse.carrent.repo.BillingRepo;
import lk.ijse.carrent.service.BillingService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class BillingServicelMPL implements BillingService {

    @Autowired
    private BillingRepo repo;

    @Autowired
    private ModelMapper map;

    @Override
    public void saveBilling(BillingDTO dto) {

        if (!repo.existsById(dto.getBillID())) {
            repo.save(map.map(dto, Billing.class));
        } else {
            throw new RuntimeException("This Billing ID id is already exists....!!!");
        }
    }

    @Override
    public void deleteBilling(String id) {

        if (repo.existsById(id)) {
            repo.deleteById(id);
        } else {
            throw new RuntimeException("Please check the Billing ID.. No Such Billing..!");
        }
    }

    @Override
    public void updateBilling(BillingDTO dto) {

        if (repo.existsById(dto.getBillID())) {
            repo.save(map.map(dto, Billing.class));
        } else {
            throw new RuntimeException("No Such Billing To Update..! Please Check the ID!");
        }
    }

    @Override
    public BillingDTO searchBilling(String id) {

        if (repo.existsById(id)){
            return map.map(repo.findById(id).get(),BillingDTO.class);
        }else {
            throw new RuntimeException("No Billing For " + id + " ..!");
        }
    }

    @Override
    public List<BillingDTO> getAllBooking() {

        return map.map(repo.findAll(), new TypeToken<List<BillingDTO>>() {
        }.getType());
    }

}
