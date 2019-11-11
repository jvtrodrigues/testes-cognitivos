package br.edu.ifrs.poa.lecc.testes.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ifrs.poa.lecc.testes.domain.Tofc;
import br.edu.ifrs.poa.lecc.testes.repositories.TofcRepository;
import br.edu.ifrs.poa.lecc.testes.services.exceptions.ObjectNotFoundException;

@Service
public class TofcService {
	
	@Autowired
	private TofcRepository repo;
	
	public Tofc find(Integer id) {
		Optional<Tofc> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Tofc.class.getName()));
	}
}
