package br.edu.ifrs.poa.lecc.testes.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ifrs.poa.lecc.testes.domain.PerguntaEscrita;
import br.edu.ifrs.poa.lecc.testes.repositories.PerguntaEscritaRepository;
import br.edu.ifrs.poa.lecc.testes.services.exceptions.ObjectNotFoundException;

@Service
public class PerguntaEscritaService {
	
	@Autowired
	private PerguntaEscritaRepository repo;
	
	public PerguntaEscrita find(Integer id) {
		Optional<PerguntaEscrita> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + PerguntaEscrita.class.getName()));
	}
}
