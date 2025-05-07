package com.Pharmacy.Pharmacy.Services;

import com.Pharmacy.Pharmacy.Repositories.ProduitsRepository;
import com.Pharmacy.Pharmacy.controllers.ProduitsController;
import com.Pharmacy.Pharmacy.entities.Produits;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.Optional;

@Service
public class ProduitService {
    @Autowired

    private ProduitsRepository produitsRepository;



    public List<Produits> getAllTasks() {
        return produitsRepository.findAll();
    }


    public Optional<Produits> getTaskById(Long id) {
        return produitsRepository.findById(id);
    }

    public  Produits save (Produits produit) {
        return produitsRepository.save(produit);
    }

    public Produits updateproduit(Long id, Produits produit) {
        produit.setNom(produit.getNom());
        produit.setPrix(produit.getPrix());
        produit.setDescription(produit.getDescription());
        produit.setQuantite(produit.getQuantite());
        return produitsRepository.save(produit);
    }


}