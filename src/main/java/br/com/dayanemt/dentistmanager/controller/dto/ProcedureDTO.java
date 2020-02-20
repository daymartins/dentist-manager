package br.com.dayanemt.dentistmanager.controller.dto;

import br.com.dayanemt.dentistmanager.enums.ProcedureCategory;

public class ProcedureDTO {

    private Long id;
    private String name;
    private Double price;
    private ProcedureCategory procedureCategory;

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
}
