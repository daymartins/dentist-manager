package br.com.dayanemt.dentistmanager.repository;

import br.com.dayanemt.dentistmanager.model.PatientCare;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientCareRepository extends JpaRepository<PatientCare, Long> {
}
