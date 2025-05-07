package com.Pharmacy.Pharmacy.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

//@Setter
//@Getter
@Entity
public class Produits {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  private String nom;
  private String description;
  private double prix;
  private double quantite;


  public Produits(long id, String nom, String description, double prix, double quantite) {
    this.id = id;
    this.nom = nom;
    this.description = description;
    this.prix = prix;
    this.quantite = quantite;
  }

  public Produits() {

  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getNom() {
    return nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public double getPrix() {
    return prix;
  }

  public void setPrix(double prix) {
    this.prix = prix;
  }

  public double getQuantite() {
    return quantite;
  }

  public void setQuantite(double quantite) {
    this.quantite = quantite;
  }
}
