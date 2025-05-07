package com.Pharmacy.Pharmacy.Repositories;

import com.Pharmacy.Pharmacy.controllers.ProduitsController;

import com.Pharmacy.Pharmacy.entities.Produits;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProduitsRepository extends JpaRepository<Produits, Long> {
}
