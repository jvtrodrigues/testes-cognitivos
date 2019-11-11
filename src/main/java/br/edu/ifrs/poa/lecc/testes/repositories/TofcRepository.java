package br.edu.ifrs.poa.lecc.testes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.ifrs.poa.lecc.testes.domain.Tofc;

@Repository
public interface TofcRepository extends JpaRepository<Tofc, Integer> {

}
