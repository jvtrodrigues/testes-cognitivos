package br.edu.ifrs.poa.lecc.testes.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ifrs.poa.lecc.testes.domain.PerguntaMultiplaEscolha;
import br.edu.ifrs.poa.lecc.testes.repositories.PerguntaMultiplaEscolhaRepository;
import br.edu.ifrs.poa.lecc.testes.services.exceptions.ObjectNotFoundException;

@Service
public class PerguntaMultiplaEscolhaService {
	
	@Autowired
	private PerguntaMultiplaEscolhaRepository repo;
	
	public PerguntaMultiplaEscolha find(Integer id) {
		Optional<PerguntaMultiplaEscolha> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + PerguntaMultiplaEscolha.class.getName()));
	}
}
