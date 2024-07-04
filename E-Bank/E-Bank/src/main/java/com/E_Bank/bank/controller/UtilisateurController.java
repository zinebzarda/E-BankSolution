package com.E_Bank.bank.controller;

import com.E_Bank.bank.model.Utillisateur;
import com.E_Bank.bank.service.UtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Utilisateur")
public class UtilisateurController {

    @Autowired
    UtilisateurService utilisateurService;

    @GetMapping("/showAllUtilisateur")
    public List<Utillisateur> showAllUtilisateur() {
       return utilisateurService.showAllUtillisateur();
    }


    @PostMapping("/savaUtilisateur")
    public Utillisateur saveUtilisateur(@RequestBody Utillisateur utilisateur) {
        utilisateurService.saveUtillisateur(utilisateur);
        return utilisateur;
    }
}
