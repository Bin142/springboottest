package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Address;
import com.example.demo.repository.MySqlRepository;

@RestController
public class StoreController {
	
	@Autowired
	MySqlRepository mySqlRepository;
	
	@GetMapping("/get-all-addresses")
	public List<Address> getAllAddresses(){
		return mySqlRepository.findAll();
	}
	@GetMapping("/get-address/{id}")
	public Address getSingleAddress(@PathVariable("id") Integer id) {
		return mySqlRepository.findById(id).get();
	}
}
