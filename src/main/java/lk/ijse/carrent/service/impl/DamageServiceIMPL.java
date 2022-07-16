package lk.ijse.carrent.service.impl;

import lk.ijse.carrent.dto.DamageDTO;
import lk.ijse.carrent.entity.Damage;
import lk.ijse.carrent.repo.DamageRepo;
import lk.ijse.carrent.service.DamageService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class DamageServiceIMPL implements DamageService {

    @Autowired
    private DamageRepo repo;

    @Autowired
    private ModelMapper map;

    @Override
    public void saveDamage(DamageDTO dto) {

        if (!repo.existsById(dto.getDamageID())) {
            repo.save(map.map(dto, Damage.class));
        } else {
            throw new RuntimeException("This Damage ID id is already exists....!!!");
        }
    }

    @Override
    public void deleteDamage(String id) {

        if (repo.existsById(id)) {
            repo.deleteById(id);
        } else {
            throw new RuntimeException("Please check the Damage ID.. No Such Damage..!");
        }
    }

    @Override
    public void updateDamage(DamageDTO dto) {

        if (!repo.existsById(dto.getDamageID())) {
            repo.save(map.map(dto, Damage.class));
        } else {
            throw new RuntimeException("No Such Damage To Update..! Please Check the ID!");
        }
    }

    @Override
    public DamageDTO searchDamage(String id) {

        if (repo.existsById(id)){
            return map.map(repo.findById(id).get(),DamageDTO.class);
        }else {
            throw new RuntimeException("No Damage For " + id + " ..!");
        }
    }

    @Override
    public List<DamageDTO> getAllDamage() {

        return map.map(repo.findAll(), new TypeToken<List<DamageDTO>>() {
        }.getType());
    }

}
