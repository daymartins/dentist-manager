package br.com.dayanemt.dentistmanager.repository;

import br.com.dayanemt.dentistmanager.model.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
}
