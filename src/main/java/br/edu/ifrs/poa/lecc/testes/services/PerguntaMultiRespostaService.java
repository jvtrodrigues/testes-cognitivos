package br.edu.ifrs.poa.lecc.testes.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ifrs.poa.lecc.testes.domain.PerguntaMultiResposta;
import br.edu.ifrs.poa.lecc.testes.repositories.PerguntaMultiRespostaRepository;
import br.edu.ifrs.poa.lecc.testes.services.exceptions.ObjectNotFoundException;

@Service
public class PerguntaMultiRespostaService {
	
	@Autowired
	private PerguntaMultiRespostaRepository repo;
	
	public PerguntaMultiResposta find(Integer id) {
		Optional<PerguntaMultiResposta> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + PerguntaMultiResposta.class.getName()));
	}
}
