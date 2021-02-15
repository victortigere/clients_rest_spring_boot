package com.raven.raven.controller;

import com.raven.raven.entity.Clients;
import com.raven.raven.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClientController {

    @Autowired
    private ClientService clientService;

//    save client
    @PostMapping("/saveclient")
    public Clients saveClient(@RequestBody Clients client){
        return clientService.saveClient(client);
    }

//    save clients
    @PostMapping("/saveclients")
    public List<Clients> saveClients(@RequestBody List<Clients> clients){
        return clientService.saveClients(clients);
    }

//    get clients
    @GetMapping("/clients")
    public List<Clients> getClients(){
        return clientService.getClients();
    }

//    get client by id
    @GetMapping("/client/{id}")
    public Clients getClientById(@PathVariable  int id){
        return clientService.getClientsById(id);
    }

//    get client by name
    @GetMapping("/clients/{name}")
    public Clients getClientByName(@PathVariable  String name){
        return clientService.getClientsByName(name);
    }

//    delete client
    @DeleteMapping("/delete/client/{id}")
    public String deleteClient(@PathVariable int id){
        clientService.deleteClient(id);
        return "Client deleted";
    }

//    update Client
    @PutMapping("/updateclient")
    public Clients updateClient(@RequestBody Clients client){
        return clientService.updateClient(client);
    }


}
