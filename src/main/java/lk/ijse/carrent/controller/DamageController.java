package lk.ijse.carrent.controller;

import lk.ijse.carrent.service.DamageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Damage")
@CrossOrigin

public class DamageController {
    @Autowired
    DamageService damageService;





}
