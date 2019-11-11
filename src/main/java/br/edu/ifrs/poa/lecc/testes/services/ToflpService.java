package br.edu.ifrs.poa.lecc.testes.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ifrs.poa.lecc.testes.domain.Toflp;
import br.edu.ifrs.poa.lecc.testes.repositories.ToflpRepository;
import br.edu.ifrs.poa.lecc.testes.services.exceptions.ObjectNotFoundException;

@Service
public class ToflpService {
	
	@Autowired
	private ToflpRepository repo;
	
	public Toflp find(Integer id) {
		Optional<Toflp> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Toflp.class.getName()));
	}
}
