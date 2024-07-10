package com.E_Bank.bank.service;

import com.E_Bank.bank.model.Compte;
import com.E_Bank.bank.model.Utillisateur;
import com.E_Bank.bank.repository.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UtilisateurService {

    @Autowired
    private UtilisateurRepository utilisateurRepository;

    @Autowired CompteService compteService;


    public Utillisateur saveUtilisateur(Utillisateur utilisateur) {
        return utilisateurRepository.save(utilisateur);
    }

    public List<Utillisateur> getAllUtilisateurs() {
        return utilisateurRepository.findAll();
    }

    public Utillisateur getUtilisateurById(int id) {
        return utilisateurRepository.findById(id).orElseThrow();
    }

    public Utillisateur updateUtilisateur(int id, Utillisateur utilisateurDetails) {
        Utillisateur utilisateur = getUtilisateurById(id);
        utilisateur.setNomUser(utilisateurDetails.getNomUser());
        utilisateur.setEmail(utilisateurDetails.getEmail());
        utilisateur.setMotDePasse(utilisateurDetails.getMotDePasse());
        return utilisateurRepository.save(utilisateur);
    }

    public void deleteUtilisateur(int id) {
        Utillisateur utilisateur = getUtilisateurById(id);
        utilisateurRepository.delete(utilisateur);
    }

    public Compte creerCompteUtilisateur(int idUtilisateur, Compte compte) {
        Utillisateur utilisateur = getUtilisateurById(idUtilisateur);
        compte.setUtilisateur(utilisateur);
        return compteService.saveCompte(compte);
    }

}
