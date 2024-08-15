package com.app.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.CustomException.CustomException;
import com.app.entity.client;
import com.app.repository.clientRepo;

@Service
@Transactional
public class clientServiceIMPL implements clientService{

	@Autowired
	public clientRepo clientRepository;
	@Override
	public boolean AddClient(client client)throws CustomException
	{
		try {
		clientRepository.save(client);
		return true;
		}catch(Exception e){
			throw new CustomException("Client Not Saved");
		}		
	}

	@Override
	public List<client> getAllclient() throws CustomException {
		try {
			return clientRepository.findAll();
			
		} catch (Exception e) {
			throw new CustomException("Failed to get all clients");
		}		
	}

	@Override
	public boolean UpdateClient(client client) throws CustomException {
		// TODO Auto-generated method stub
		try {
		Optional<client> enteredClient=clientRepository.findById(client.getClient_Id());
		if(enteredClient.isPresent()) {
		client newClient=enteredClient.get();
		newClient.setName(client.getName());
		newClient.setPhonenumber(client.getPhonenumber());
		newClient.setEmail(client.getEmail());
		newClient.setPassword(client.getPassword());
		clientRepository.save(newClient);
		return true;
		}else {
			return false;
		}
		}catch(Exception e) {
			throw new CustomException("Failed to update the client ");
		}
	}
}
