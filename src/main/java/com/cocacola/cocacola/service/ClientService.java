package com.cocacola.cocacola.service;

import com.cocacola.cocacola.model.Client;

public interface ClientService
{
    Iterable<Client> retrieveClients(String age);
    Client retrieveClient(String id);
    Client updateClient(String id, Client client);
    void deleteClient(String id);
}