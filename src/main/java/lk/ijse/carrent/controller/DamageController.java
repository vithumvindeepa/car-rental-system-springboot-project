package lk.ijse.carrent.controller;

import lk.ijse.carrent.dto.DamageDTO;
import lk.ijse.carrent.service.DamageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import util.ResponceUtil;

@RestController
@RequestMapping("Damage")
@CrossOrigin

public class DamageController {
    @Autowired
    DamageService damageService;

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponceUtil SaveDamage(DamageDTO damagedto) {
        damageService.saveDamage(damagedto);
        return new ResponceUtil(200, "save", null);

    }

    @DeleteMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponceUtil DeleteDamage(@RequestParam String iD) {
        damageService.deleteDamage(iD);
        return new ResponceUtil(200, "delete", null);
    }


}
