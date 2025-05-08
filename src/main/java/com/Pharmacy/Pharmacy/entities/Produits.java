package com.Pharmacy.Pharmacy.entities;

import jakarta.persistence.*;

@Entity
public class Produits {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String nom;
  private String description;
  private double prix;
  private int quantite;

  public Produits() {}

  public Produits(String nom, String description, double prix, int quantite) {
    this.nom = nom;
    this.description = description;
    this.prix = prix;
    this.quantite = quantite;
  }

  // Getters & Setters
  public Long getId() { return id; }
  public void setId(Long id) { this.id = id; }

  public String getNom() { return nom; }
  public void setNom(String nom) { this.nom = nom; }

  public String getDescription() { return description; }
  public void setDescription(String description) { this.description = description; }

  public double getPrix() { return prix; }
  public void setPrix(double prix) { this.prix = prix; }

  public int getQuantite() { return quantite; }
  public void setQuantite(int quantite) { this.quantite = quantite; }
}
