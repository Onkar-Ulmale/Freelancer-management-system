package com.app.services;

import java.util.List;

import com.app.CustomException.CustomException;
import com.app.dto.clientAddDTO;
import com.app.entity.client;

public interface clientService {
	
	public boolean AddClient(clientAddDTO clientDTO) throws CustomException, Exception;
	public List<client> getAllclient() throws CustomException;
	public boolean UpdateClient(client client) throws CustomException;
	public clientAddDTO findByEmail(String email);
	
	

}
