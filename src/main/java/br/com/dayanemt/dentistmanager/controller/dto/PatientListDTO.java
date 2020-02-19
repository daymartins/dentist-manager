package br.com.dayanemt.dentistmanager.controller.dto;

public class PatientListDTO {

    private Long id;
    private String nome;
    private String telefone;
    private String email;

    public PatientListDTO(Long id, String nome, String telefone, String email) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
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
}
