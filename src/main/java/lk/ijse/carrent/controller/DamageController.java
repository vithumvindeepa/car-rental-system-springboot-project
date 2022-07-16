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
    public ResponceUtil SaveDamage(DamageDTO damageDTO) {
        damageService.saveDamage(damageDTO);
        return new ResponceUtil(200, "save", null);

    }

    @DeleteMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponceUtil DeleteDamage(@RequestParam String iD) {
        damageService.deleteDamage(iD);
        return new ResponceUtil(200, "delete", null);
    }

    @PutMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponceUtil updateDamage(@RequestBody DamageDTO damageDTO) {
        damageService.updateDamage(damageDTO);
        return new ResponceUtil(200, "update", null);
    }

    @GetMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponceUtil SearchDamage(@PathVariable String iD) {
        return new ResponceUtil(200, "search", damageService.searchDamage(iD));
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponceUtil getAllDamage() {
        return new ResponceUtil(200, "all", damageService.getAllDamage());
    }

}
