package com.samuel.barbearia.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.samuel.barbearia.model.Pessoa;
import com.samuel.barbearia.servico.PessoaServico;

@RestController
@RequestMapping("pessoas")
public class PessoaController {

	private final PessoaServico pessoaServico;

	public PessoaController(PessoaServico pessoaServico) {
		this.pessoaServico = pessoaServico;
	}
	
	@GetMapping
	public List<Pessoa> findAll(){
	  return pessoaServico.findAll();
	}
	
	@PostMapping
	public Pessoa create(@RequestBody Pessoa pessoa){
	    return pessoaServico.save(pessoa);
	}

}
