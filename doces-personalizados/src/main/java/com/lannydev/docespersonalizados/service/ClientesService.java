package com.lannydev.docespersonalizados.service;

import com.lannydev.docespersonalizados.model.Cliente;
import com.lannydev.docespersonalizados.repository.ClientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientesService {

    @Autowired
    private ClientesRepository repository;


   /*
   @Autowired
   public ClientesService(ClientesRepository repository){
        this.repository = repository;
    }*/

    public void salvarCliente(Cliente cliente){
        validarCliente(cliente);
        this.repository.persistir(cliente);
    }

    public void validarCliente(Cliente cliente){
        //aplica validações

    }
}
