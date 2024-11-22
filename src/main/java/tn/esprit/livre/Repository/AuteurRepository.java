package tn.esprit.livre.Repository;

import tn.esprit.livre.Entity.Auteur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuteurRepository extends JpaRepository<Auteur, Long> {
}
