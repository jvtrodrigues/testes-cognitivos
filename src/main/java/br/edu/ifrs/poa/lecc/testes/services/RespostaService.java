package br.edu.ifrs.poa.lecc.testes.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ifrs.poa.lecc.testes.domain.Resposta;
import br.edu.ifrs.poa.lecc.testes.repositories.RespostaRepository;
import br.edu.ifrs.poa.lecc.testes.services.exceptions.ObjectNotFoundException;

@Service
public class RespostaService {
	
	@Autowired
	private RespostaRepository repo;
	
	public Resposta find(Integer id) {
		Optional<Resposta> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Resposta.class.getName()));
	}
}
