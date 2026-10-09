
package com.example.autoloc.services;

import com.example.autoloc.entities.Equipement;
import java.util.List;

public interface IEquipementService {
    Equipement ajouterEquipement(Equipement equipement);
    Equipement modifierEquipement(Equipement equipement);
    List<Equipement> consulterEquipements();
    Equipement consulterEquipement(Long idEquipement);
    void supprimerEquipement(Long idEquipement);
}
