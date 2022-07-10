package lk.ijse.carrent.service;

import lk.ijse.carrent.dto.DamageDTO;

import java.util.List;

public interface DamageService {

    void saveDamage(DamageDTO dto);

    void deleteDamage(String id);

    void updateDamage(String dto);

    DamageDTO searchDamage(String id);

    List<DamageDTO> getAllDamage();
}
