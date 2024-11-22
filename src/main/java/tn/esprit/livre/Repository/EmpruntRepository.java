package tn.esprit.livre.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.livre.Entity.Emprunt;

public interface EmpruntRepository extends JpaRepository<Emprunt, Long> {
    // Custom query methods can be added here if needed
}
