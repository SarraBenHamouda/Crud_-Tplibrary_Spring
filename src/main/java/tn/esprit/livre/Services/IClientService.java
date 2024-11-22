package tn.esprit.livre.Services;

import tn.esprit.livre.Entity.Client;
import java.util.List;

public interface IClientService {


    List<Client> retrieveAllClients();
    Client addClient( Client c);
    Client modifyClient( Client c);
    Client retrieveClient(Long idClient);
    void deleteClient(Long idClient);
}
