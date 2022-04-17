package com.cocacola.cocacola.service.implementation;

import com.cocacola.cocacola.model.Client;
import com.cocacola.cocacola.repository.ClientRepository;
import com.cocacola.cocacola.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientServiceImplementation implements ClientService {
    @Autowired
    private ClientRepository clientRepository;
    public Iterable<Client> retrieveClients(String age)
    {
        if(age==null)
            return clientRepository.findAll();
        else
        {
            int ageInt=Integer.parseInt(age);
            return clientRepository.getClientByAge(ageInt);

        }
    }
    @Override
    public Client retrieveClient(String id)
    {
        Client response=null;
        if(clientRepository.existsById(id))
        {
            Iterable<Client> clients= clientRepository.retrieveClient(id);

            for(Client client:clients)
            {
                response=client;
            }
            return response;

        }
        return response;

    }

    @Override
    public Client updateClient(String id, Client client){
        if(clientRepository.existsById(id))
        {
            return clientRepository.save(client);
        }
        else
        {
            return null;
        }
    }
    @Override
    public void deleteClient(String id)
    {
        clientRepository.deleteById(id);
    }



}