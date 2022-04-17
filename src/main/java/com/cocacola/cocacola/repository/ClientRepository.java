package com.cocacola.cocacola.repository;

import com.cocacola.cocacola.model.Client;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;


public interface ClientRepository extends CrudRepository<Client, String>
{
    @Query("SELECT * FROM CLIENT WHERE CLIENT.AGE= :age")
    public Iterable<Client> getClientByAge(int age);

    /*
    @Query("INSERT INTO CLIENT VALUES(:client.id, :client.name_client,:client.surname_client, :client.email, :client.age, )
    public Client createClient(String id, String name_client, String surname_client, String email int age);
    */

    @Query("SELECT * FROM CLIENT WHERE CLIENT.ID=:id")
    public Iterable<Client> retrieveClient(String id);
}