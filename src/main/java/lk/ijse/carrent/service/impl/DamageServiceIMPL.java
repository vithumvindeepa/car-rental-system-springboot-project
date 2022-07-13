package lk.ijse.carrent.service.impl;

import lk.ijse.carrent.dto.BillingDTO;
import lk.ijse.carrent.dto.DamageDTO;
import lk.ijse.carrent.entity.Billing;
import lk.ijse.carrent.entity.Damage;
import lk.ijse.carrent.repo.DamageRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

public class DamageServiceIMPL {

    @Autowired
    private DamageRepo repo;

    @Autowired
    private ModelMapper map;

    public void saveDamage(DamageDTO dto) {

        if (!repo.existsById(dto.getDamageID())) {
            repo.save(map.map(dto, Damage.class));
        } else {
            throw new RuntimeException("This Damage ID id is already exists....!!!");
        }
    }

    public void deleteDamage(String id) {

        if (repo.existsById(id)) {
            repo.deleteById(id);
        } else {
            throw new RuntimeException("Please check the Damage ID.. No Such Damage..!");
        }
    }

    public void updateDamage(DamageDTO dto) {

        if (!repo.existsById(dto.getDamageID())) {
            repo.save(map.map(dto, Damage.class));
        } else {
            throw new RuntimeException("No Such Damage To Update..! Please Check the ID!");
        }
    }

    public DamageDTO searchDamage(String id) {

        if (repo.existsById(id)){
            return map.map(repo.findById(id).get(),DamageDTO.class);
        }else {
            throw new RuntimeException("No Damage For " + id + " ..!");
        }
    }


}
