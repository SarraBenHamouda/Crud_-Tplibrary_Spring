package tn.esprit.livre.Entity;

import jakarta.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Bibliotheque {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idBibliotheque;

    private String nom;

    private String adresse;

    @OneToMany(mappedBy = "bibliotheque")
    private Set<Livre> livres = new HashSet<>();

    // Getters and Setters
    public Long getIdBibliotheque() {
        return idBibliotheque;
    }

    public void setIdBibliotheque(Long idBibliotheque) {
        this.idBibliotheque = idBibliotheque;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public Set<Livre> getLivres() {
        return livres;
    }

    public void setLivres(Set<Livre> livres) {
        this.livres = livres;
    }
}
