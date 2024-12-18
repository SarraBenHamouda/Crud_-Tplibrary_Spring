package tn.esprit.livre.Entity;

import jakarta.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Auteur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAuteur;

    private String nom;

    @OneToMany(mappedBy = "auteur")
    private Set<Livre> livres = new HashSet<>();

    // Getters and Setters
    public Long getIdAuteur() {
        return idAuteur;
    }

    public void setIdAuteur(Long idAuteur) {
        this.idAuteur = idAuteur;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Set<Livre> getLivres() {
        return livres;
    }

    public void setLivres(Set<Livre> livres) {
        this.livres = livres;
    }
}
