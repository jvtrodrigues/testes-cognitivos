package br.edu.ifrs.poa.lecc.testes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.ifrs.poa.lecc.testes.domain.RespostaMultiplaEscolha;

@Repository
public interface RespostaMultiplaEscolhaRepository extends JpaRepository<RespostaMultiplaEscolha, Integer> {

}
