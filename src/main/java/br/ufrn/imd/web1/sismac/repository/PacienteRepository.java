package br.ufrn.imd.web1.sismac.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.ufrn.imd.web1.sismac.domain.Paciente;

public interface PacienteRepository extends JpaRepository<Paciente, Integer>{

}
