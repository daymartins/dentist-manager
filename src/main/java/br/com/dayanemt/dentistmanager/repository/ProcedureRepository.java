package br.com.dayanemt.dentistmanager.repository;

import br.com.dayanemt.dentistmanager.model.Procedure;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProcedureRepository extends JpaRepository<Procedure, Long> {
}
