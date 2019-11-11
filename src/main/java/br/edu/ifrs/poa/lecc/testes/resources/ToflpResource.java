package br.edu.ifrs.poa.lecc.testes.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifrs.poa.lecc.testes.domain.Toflp;
import br.edu.ifrs.poa.lecc.testes.services.ToflpService;

@RestController
@RequestMapping(value = "/toflps")
public class ToflpResource {
	
	@Autowired
	private ToflpService service;
	
	@RequestMapping(value="/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {
		Toflp obj = service.find(id);		
		return ResponseEntity.ok().body(obj);		
	}
	
}