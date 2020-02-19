package br.com.dayanemt.dentistmanager.model;

import br.com.dayanemt.dentistmanager.enums.ProcedureCategory;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;

@Entity
public class Procedure {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Double price;

    @Enumerated(EnumType.STRING)
    private ProcedureCategory procedureCategory;

    @OneToMany(mappedBy = "procedure")
    private Set<PatientProcedure> patientProcedures;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Procedure procedure = (Procedure) o;
        return Objects.equals(id, procedure.id);
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public ProcedureCategory getProcedureCategory() {
        return procedureCategory;
    }

    public void setProcedureCategory(ProcedureCategory procedureCategory) {
        this.procedureCategory = procedureCategory;
    }

    public Set<PatientProcedure> getPatientProcedures() {
        return patientProcedures;
    }

    public void setPatientProcedures(Set<PatientProcedure> patientProcedures) {
        this.patientProcedures = patientProcedures;
    }
}
