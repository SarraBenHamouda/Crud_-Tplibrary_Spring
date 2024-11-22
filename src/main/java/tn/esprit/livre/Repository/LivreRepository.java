package tn.esprit.livre.Repository;

import tn.esprit.livre.Entity.Livre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivreRepository extends JpaRepository<Livre, Long> {
}
