package br.com.dayanemt.dentistmanager.controller.dto;

import java.util.Date;

public class AppointmentDTO {

    private Long id;
    private String description;
    private Date dtScheduled;
    private Long patientId;
    private String patientName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDtScheduled() {
        return dtScheduled;
    }

    public void setDtScheduled(Date dtScheduled) {
        this.dtScheduled = dtScheduled;
    }

    public Long getPatientId() {
        return patientId;
    }

    public void setPatientId(Long patientId) {
        this.patientId = patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }
}
