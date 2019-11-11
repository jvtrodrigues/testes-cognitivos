package br.edu.ifrs.poa.lecc.testes.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ifrs.poa.lecc.testes.domain.Tofp;
import br.edu.ifrs.poa.lecc.testes.repositories.TofpRepository;
import br.edu.ifrs.poa.lecc.testes.services.exceptions.ObjectNotFoundException;

@Service
public class TofpService {
	
	@Autowired
	private TofpRepository repo;
	
	public Tofp find(Integer id) {
		Optional<Tofp> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Tofp.class.getName()));
	}
}
