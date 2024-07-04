package com.E_Bank.bank.service;

import com.E_Bank.bank.model.Utillisateur;
import com.E_Bank.bank.repository.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UtilisateurService {

    @Autowired
    private UtilisateurRepository utilisateurRepository;

    public Utillisateur saveUtillisateur(Utillisateur utillisateur) {
        return utilisateurRepository.save(utillisateur);
    }

    public List<Utillisateur> showAllUtillisateur() {
        return utilisateurRepository.findAll();
    }


}
