package br.com.dayanemt.dentistmanager.controller.dto;

import br.com.dayanemt.dentistmanager.model.Patient;
import org.springframework.data.domain.Page;

public class PatientListDTO {

    private Long id;
    private String nome;
    private String telefone;
    private String email;

    public PatientListDTO(Patient patient) {
        this.id = patient.getId();
        this.nome = patient.getName();
        this.telefone = patient.getCellphone();
        this.email = patient.getEmail();
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public static Page<PatientListDTO> convert (Page<Patient> patients){
        return patients.map(PatientListDTO::new);
    }
}
