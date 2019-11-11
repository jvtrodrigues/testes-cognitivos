package br.edu.ifrs.poa.lecc.testes.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ifrs.poa.lecc.testes.domain.Toc;
import br.edu.ifrs.poa.lecc.testes.repositories.TocRepository;
import br.edu.ifrs.poa.lecc.testes.services.exceptions.ObjectNotFoundException;

@Service
public class TocService {
	
	@Autowired
	private TocRepository repo;
	
	public Toc find(Integer id) {
		Optional<Toc> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Toc.class.getName()));
	}
}
