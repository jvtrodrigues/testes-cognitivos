package br.edu.ifrs.poa.lecc.testes.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifrs.poa.lecc.testes.domain.Resposta;
import br.edu.ifrs.poa.lecc.testes.services.RespostaService;

@RestController
@RequestMapping(value = "/respostas")
public class RespostaResource {
	
	@Autowired
	private RespostaService service;
	
	@RequestMapping(value="/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {
		Resposta obj = service.find(id);		
		return ResponseEntity.ok().body(obj);		
	}
	
}