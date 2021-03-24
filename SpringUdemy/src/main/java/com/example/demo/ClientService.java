package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {

	@Autowired
	private ClientRepository clientRepository;
	
	public void salvarClient(Client client) {
		validarClient(client);
		this.clientRepository.persistir(client);
		
	}
	
	public void validarClient(Client client) {
		//aplica validações
	}
}
