package tn.esprit.livre.Control;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.livre.Entity.Client;
import tn.esprit.livre.Services.IClientService;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/client")
public class ClientController {

    IClientService ClientService;
    // http://localhost:8089/livre/client/retrieve-all-clients
    @GetMapping("/retrieve-all-clients")
    public List<Client> getClients() {
        List<Client> listClients = ClientService.retrieveAllClients();
        return listClients;
    }
    // http://localhost:8089/livre/client/retrieve-all-client/8
    @GetMapping("/retrieve-client/{client-id}")
    public Client retrieveClient(@PathVariable("client-id") Long idClient) {
        Client client = ClientService.retrieveClient(idClient);
        return client;
    }

    @PostMapping("/add-client")
    public Client addClient(@RequestBody Client client) {
        return ClientService.addClient(client);
    }

    // http://localhost:8089/livre/client/remove-client/{client-id}
    @DeleteMapping("/remove-client/{client-id}")
    public void deleteClient(@PathVariable("client-id") Long idClient) {
        ClientService.deleteClient(idClient);
    }

    // http://localhost:8089/livre/client/modify-client
    @PutMapping("/modify-client")
    public Client modifyClient(@RequestBody Client client) {
        return ClientService.modifyClient(client);
    }


}