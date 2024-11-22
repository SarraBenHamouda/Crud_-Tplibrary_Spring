package tn.esprit.livre.Repository;

import tn.esprit.livre.Entity.Bibliotheque;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BibliothequeRepository extends JpaRepository<Bibliotheque, Long> {
}
