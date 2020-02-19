package br.com.dayanemt.dentistmanager.model;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;
import java.util.Set;

@Entity
public class PatientCare {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String observations;

    @Temporal(TemporalType.TIMESTAMP)
    private Date serviceDate;

    @ManyToMany
    private Set<PatientProcedure> procedures;

    @ManyToOne
    private Patient patient;

    @OneToOne
    private ProcedurePayment payment;

    @OneToOne
    private Appointment appointment;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PatientCare patientCare = (PatientCare) o;
        return Objects.equals(id, patientCare.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getObservations() {
        return observations;
    }

    public void setObservations(String observations) {
        this.observations = observations;
    }

    public Date getServiceDate() {
        return serviceDate;
    }

    public void setServiceDate(Date serviceDate) {
        this.serviceDate = serviceDate;
    }

    public Set<PatientProcedure> getProcedures() {
        return procedures;
    }

    public void setProcedures(Set<PatientProcedure> procedures) {
        this.procedures = procedures;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public ProcedurePayment getPayment() {
        return payment;
    }

    public void setPayment(ProcedurePayment payment) {
        this.payment = payment;
    }

    public Appointment getAppointment() {
        return appointment;
    }

    public void setAppointment(Appointment appointment) {
        this.appointment = appointment;
    }
}
