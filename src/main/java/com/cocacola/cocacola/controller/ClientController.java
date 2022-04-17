package com.cocacola.cocacola.controller;

import com.cocacola.cocacola.model.Client;
import com.cocacola.cocacola.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")

public class ClientController
{
    @Autowired
    private ClientService clientService;

    @GetMapping("/clients")
    public ResponseEntity<Iterable<Client>> retrieveClients(@RequestParam(required = false) String age)
    {
        Iterable<Client> response= clientService.retrieveClients(age);
        return ResponseEntity.ok().body(response);
    }

    /*
    @PostMapping("/clients")
    public ResponseEntity<Client> createClient(@RequestBody Client client)
    {
        Client newClient= clientService.createClient(client);
        return ResponseEntity.ok().body(newClient);
    }
     */

    @GetMapping("/clients/{id}/")
    public ResponseEntity<Client> retrieveClient(@PathVariable String id)
    {
        Client response= clientService.retrieveClient(id);
        return ResponseEntity.ok().body(response);
    }

    @PutMapping("/clients/{id}/")
    public ResponseEntity<Client> updateClient(@PathVariable String id, @RequestBody Client client)
    {
        Client newClient= clientService.updateClient(id,client);
        if(newClient==null)
        {
            return ResponseEntity.badRequest().body(null);
        }

        return ResponseEntity.ok().body(newClient);

    }
    @DeleteMapping("/clients/{id}/")
    public ResponseEntity<Client> deleteClient(@PathVariable String id)
    {
        clientService.deleteClient(id);
        return ResponseEntity.noContent().build();
    }

}
