package com.BankLine.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.BankLine.demo.model.Correntista;
import com.BankLine.demo.repository.correntistaRepository;


@Controller
@RequestMapping("/correntistas")
public class correntistaController {
	@Autowired
	private correntistaRepository repository;
	
	@GetMapping
	public List<Correntista> findAll(){
		   return repository.findAll();
		
	}

}
