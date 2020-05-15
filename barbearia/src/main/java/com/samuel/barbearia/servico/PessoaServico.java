package com.samuel.barbearia.servico;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.samuel.barbearia.model.Pessoa;
import com.samuel.barbearia.repository.PessoaRepository;

@Service
public class PessoaServico {

	private final PessoaRepository pessoaRepository;

	@Autowired
	public PessoaServico(PessoaRepository pessoaRepository) {
		this.pessoaRepository = pessoaRepository;

	}

	public List<Pessoa> findAll() {
		return this.pessoaRepository.findAll();
	}

	public Pessoa save(Pessoa entity) {
		return this.pessoaRepository.save(entity);
	}

	public void save(Long id) {
		this.pessoaRepository.deleteById(id);
	}

}
