package br.edu.ifrs.poa.lecc.testes.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ifrs.poa.lecc.testes.domain.Pergunta;
import br.edu.ifrs.poa.lecc.testes.repositories.PerguntaRepository;
import br.edu.ifrs.poa.lecc.testes.services.exceptions.ObjectNotFoundException;

@Service
public class PerguntaService {
	
	@Autowired
	private PerguntaRepository repo;
	
	public Pergunta find(Integer id) {
		Optional<Pergunta> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Pergunta.class.getName()));
	}
}
