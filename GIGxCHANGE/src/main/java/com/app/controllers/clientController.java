package com.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.clientAddDTO;
import com.app.services.clientService;


@RestController
@RequestMapping("/client")
public class clientController {
	
	@Autowired
	private clientService clientService;
	
	@PostMapping("/addClient")
	public boolean addClient(@RequestBody clientAddDTO clientDTO)throws Exception
	{
		clientService.AddClient(clientDTO);
		return true;
	}
}
