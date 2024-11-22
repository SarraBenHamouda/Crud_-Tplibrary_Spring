package tn.esprit.livre.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.livre.Entity.Client;
import tn.esprit.livre.Repository.ClientRepository;
import java.util.List;

@Service
@AllArgsConstructor
class ClientService implements IClientService{
    ClientRepository ClientRepository;

    @Override
    public List<Client> retrieveAllClients() {
        return ClientRepository.findAll();
    }

    @Override
    public Client addClient(Client client) {
        return ClientRepository.save(client);
    }


    @Override
    public Client retrieveClient(Long idClient) {
        return ClientRepository.findById(idClient).orElse(null);
    }

    @Override
    public void deleteClient(Long idClient) {
        ClientRepository.deleteById(idClient);
    }

    @Override
    public Client modifyClient(Client client) {
        return ClientRepository.save(client);
    }
}
