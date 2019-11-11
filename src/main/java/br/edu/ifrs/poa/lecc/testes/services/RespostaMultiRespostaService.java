package br.edu.ifrs.poa.lecc.testes.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ifrs.poa.lecc.testes.domain.RespostaMultiResposta;
import br.edu.ifrs.poa.lecc.testes.repositories.RespostaMultiRespostaRepository;
import br.edu.ifrs.poa.lecc.testes.services.exceptions.ObjectNotFoundException;

@Service
public class RespostaMultiRespostaService {
	
	@Autowired
	private RespostaMultiRespostaRepository repo;
	
	public RespostaMultiResposta find(Integer id) {
		Optional<RespostaMultiResposta> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + RespostaMultiResposta.class.getName()));
	}
}
