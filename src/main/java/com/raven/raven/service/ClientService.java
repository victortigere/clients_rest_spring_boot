package com.raven.raven.service;

import com.raven.raven.entity.Clients;
import com.raven.raven.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {
    @Autowired
    private ClientRepository clientRepository;

//    save client
    public Clients saveClient(Clients client){
        return clientRepository.save(client);
    }

//    save clients
    public List<Clients> saveClients(List<Clients> clients){
        return clientRepository.saveAll(clients);
    }

//    get client
    public List<Clients> getClients(){
        return clientRepository.findAll();
    }

//    get client by id
    public Clients getClientsById(int id){
        return clientRepository.findById(id).orElse(null);
    }

//    find by name
    public Clients getClientsByName(String name){
        return clientRepository.findByName(name);
    }

//    delete by id
    public String deleteClient(int id){
        clientRepository.deleteById(id);
        return "Client Deleted";
    }

//    update client
    public Clients updateClient(Clients client){
        Clients existingClient = clientRepository.findById(client.getId()).orElse(null);
        existingClient.setName(client.getName());
        existingClient.setSurname(client.getSurname());
        existingClient.setEmail(client.getEmail());
        existingClient.setMobileNumber(client.getMobileNumber());
        return clientRepository.save(existingClient);

    }

}
