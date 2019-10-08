package br.edu.ifrs.poa.lecc.testes.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ifrs.poa.lecc.testes.domain.Pesquisador;
import br.edu.ifrs.poa.lecc.testes.repositories.PesquisadorRepository;
import br.edu.ifrs.poa.lecc.testes.services.exceptions.ObjectNotFoundException;

@Service
public class PesquisadorService {
	
	@Autowired
	private PesquisadorRepository repo;
	
	public Pesquisador find(Integer id) {
		Optional<Pesquisador> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Pesquisador.class.getName()));
	}
}
