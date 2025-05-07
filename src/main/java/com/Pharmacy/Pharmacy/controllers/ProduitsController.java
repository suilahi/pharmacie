package com.Pharmacy.Pharmacy.controllers;

import com.Pharmacy.Pharmacy.Repositories.ProduitsRepository;
import com.Pharmacy.Pharmacy.Services.ProduitService;
import com.Pharmacy.Pharmacy.entities.Produits;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Produits")
public class ProduitsController {
    private final ProduitsRepository produitsRepository;
    private final ProduitService produitService;

    @Autowired
    public ProduitsController(ProduitsRepository produitsRepository, ProduitService produitService) {
        this.produitsRepository = produitsRepository;
        this.produitService = produitService;
    }

    @GetMapping("/list")
    public List<Produits> getAllTasks() {
        produitService.getAllTasks().forEach(System.out::println);
        return produitService.getAllTasks();
    }

    @GetMapping("/{id}")
    public Produits getTaskById(@PathVariable Long id) {
        return produitService.getTaskById(id).orElseThrow();
    }

    @PostMapping
    public Produits saveproduit(@RequestBody Produits produit) {
        return produitService.save(produit);
    }

    @PutMapping("/Produits/{id}")
    public Produits updateProduit(@PathVariable long id , @RequestBody Produits produit) {
        return produitsRepository.save(produit);
    }

}
