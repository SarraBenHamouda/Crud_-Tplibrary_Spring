package tn.esprit.livre.Entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "emprunt") // Make sure this matches your database table name
public class Emprunt {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // This is the primary key

    @ManyToOne
    @JoinColumn(name = "id_livre", nullable = false)
    private Livre livre; // Foreign key reference

    @ManyToOne
    @JoinColumn(name = "id_client", nullable = false)
    private Client client; // Foreign key reference

    private LocalDate dateEmprunt; // Date of borrowing
    private LocalDate dateRetour; // Date of return

    // Getters and Setters
    public Long getId() { // Ensure this getter is present
        return id;
    }

    public void setId(Long id) { // Optional: If you need to set the id
        this.id = id;
    }

    public Livre getLivre() {
        return livre;
    }

    public void setLivre(Livre livre) {
        this.livre = livre;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public LocalDate getDateEmprunt() {
        return dateEmprunt;
    }

    public void setDateEmprunt(LocalDate dateEmprunt) {
        this.dateEmprunt = dateEmprunt;
    }

    public LocalDate getDateRetour() {
        return dateRetour;
    }

    public void setDateRetour(LocalDate dateRetour) {
        this.dateRetour = dateRetour;
    }

    // Constructors
    public Emprunt() {
    }

    public Emprunt(Livre livre, Client client, LocalDate dateEmprunt, LocalDate dateRetour) {
        this.livre = livre;
        this.client = client;
        this.dateEmprunt = dateEmprunt;
        this.dateRetour = dateRetour;
    }
}
