package com.ensim.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.ensim.model.Address;
import com.ensim.model.AddressRepository;

@Controller
public class AddressController {
	
	@Autowired
	AddressRepository addressRepository ;
	@GetMapping ("/adresses")
	public String showAddresses ( Model model ) {
	model.addAttribute ("allAdresses", addressRepository.findAll() ) ;
	return "addresses";
	}
	
	@GetMapping ("/adresse")
	public String newAddress ( Model model ) {
	return "addresse";
	}
	

	


}
