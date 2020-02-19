package br.com.dayanemt.dentistmanager.model;

import br.com.dayanemt.dentistmanager.enums.ProcedureLocation;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;
import java.util.Set;

@Entity
public class PatientProcedure {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Temporal(TemporalType.TIMESTAMP)
    private Date procedureDate;

    @Enumerated(EnumType.STRING)
    private ProcedureLocation procedureLocation;

    @ManyToOne
    private Patient patient;

    @ManyToOne
    private Procedure procedure;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PatientProcedure patientProcedure = (PatientProcedure) o;
        return Objects.equals(id, patientProcedure.id);
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

    public Date getProcedureDate() {
        return procedureDate;
    }

    public void setProcedureDate(Date procedureDate) {
        this.procedureDate = procedureDate;
    }

    public ProcedureLocation getProcedureLocation() {
        return procedureLocation;
    }

    public void setProcedureLocation(ProcedureLocation procedureLocation) {
        this.procedureLocation = procedureLocation;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Procedure getProcedure() {
        return procedure;
    }

    public void setProcedure(Procedure procedure) {
        this.procedure = procedure;
    }
}
