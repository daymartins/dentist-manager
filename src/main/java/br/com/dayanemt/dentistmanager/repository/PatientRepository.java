package br.com.dayanemt.dentistmanager.repository;

import br.com.dayanemt.dentistmanager.model.Patient;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {

    Page<Patient> findPatient(String name, String cellphone, Pageable pagination);
}
