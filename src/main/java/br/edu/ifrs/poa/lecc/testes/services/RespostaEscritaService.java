package br.edu.ifrs.poa.lecc.testes.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ifrs.poa.lecc.testes.domain.RespostaEscrita;
import br.edu.ifrs.poa.lecc.testes.repositories.RespostaEscritaRepository;
import br.edu.ifrs.poa.lecc.testes.services.exceptions.ObjectNotFoundException;

@Service
public class RespostaEscritaService {
	
	@Autowired
	private RespostaEscritaRepository repo;
	
	public RespostaEscrita find(Integer id) {
		Optional<RespostaEscrita> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + RespostaEscrita.class.getName()));
	}
}
