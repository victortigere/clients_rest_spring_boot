package com.raven.raven.repository;

import com.raven.raven.entity.Clients;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Clients, Integer> {

//    Find by name
    Clients findByName(String name);

}
