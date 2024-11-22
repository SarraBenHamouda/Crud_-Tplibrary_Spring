package tn.esprit.livre.Entity;

import jakarta.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "livre") // Specify the table name in the database
public class Livre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idLivre; // Clé primaire

    private String titre;

    private int anneePublication;

    @ManyToOne
    @JoinColumn(name = "id_auteur", nullable = false)
    private Auteur auteur; // Clé étrangère vers Auteur

    @ManyToOne
    @JoinColumn(name = "id_bibliotheque", nullable = false)
    private Bibliotheque bibliotheque; // Clé étrangère vers Bibliotheque

    // Remove the ManyToMany relationship
    // private Set<Emprunt> emprunts = new HashSet<>(); // You can manage this if needed

    // Getters et Setters

    public Long getIdLivre() {
        return idLivre;
    }

    public void setIdLivre(Long idLivre) {
        this.idLivre = idLivre;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public int getAnneePublication() {
        return anneePublication;
    }

    public void setAnneePublication(int anneePublication) {
        this.anneePublication = anneePublication;
    }

    public Auteur getAuteur() {
        return auteur;
    }

    public void setAuteur(Auteur auteur) {
        this.auteur = auteur;
    }

    public Bibliotheque getBibliotheque() {
        return bibliotheque;
    }

    public void setBibliotheque(Bibliotheque bibliotheque) {
        this.bibliotheque = bibliotheque;
    }
}
