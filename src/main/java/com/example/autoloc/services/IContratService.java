package com.example.autoloc.services;

import com.example.autoloc.entities.Contrat;

import java.util.List;

public interface IContratService {
    Contrat ajouterContrat(Contrat contrat);
    Contrat modifierContrat (Contrat contrat);
    List<Contrat> consulterContrats();
    Contrat consultetContrat(Long idContrat);
    void supprimerContrat(Long idContrat);

}
