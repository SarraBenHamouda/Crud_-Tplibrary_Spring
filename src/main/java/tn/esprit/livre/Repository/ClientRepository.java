package tn.esprit.livre.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.livre.Entity.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {
    // You can add custom query methods here if needed
}
