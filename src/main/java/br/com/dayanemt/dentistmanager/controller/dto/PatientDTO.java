package br.com.dayanemt.dentistmanager.controller.dto;

import br.com.dayanemt.dentistmanager.model.Patient;
import org.springframework.data.domain.Page;

import java.util.Calendar;
import java.util.Date;

public class PatientDTO {

    private Long id;
    private String name;
    private String telephone;
    private String cellphone;
    private String email;

    private String street;
    private Integer number;
    private String complement;
    private String neighborhood;
    private String city;
    private String state;
    private Integer postalCode;

    private Date birthDate;
    private Integer age;

    private Double weight;
    private Double height;

    private String allergy;
    private String disease;
    private Boolean highBloodPressure;
    private Boolean diabetes;
    private String medicines;
    private String observations;

    public PatientDTO(Patient patient) {
        Integer yearsOld = null;
        if (patient.getBirthDate() != null) {
            Calendar today = Calendar.getInstance();
            Calendar dayBirth = Calendar.getInstance();
            dayBirth.setTime(patient.getBirthDate());

            yearsOld = today.get(Calendar.YEAR) - dayBirth.get(Calendar.YEAR);
        }

        this.id = patient.getId();
        this.name = patient.getName();
        this.telephone = patient.getTelephone();
        this.cellphone = patient.getCellphone();
        this.email = patient.getEmail();
        this.street = patient.getStreet();
        this.number = patient.getNumber();
        this.complement = patient.getComplement();
        this.neighborhood = patient.getNeighborhood();
        this.city = patient.getCity();
        this.state = patient.getState();
        this.postalCode = patient.getPostalCode();
        this.birthDate = patient.getBirthDate();
        this.age = yearsOld;
        this.weight = patient.getWeight();
        this.height = patient.getHeight();
        this.allergy = patient.getAllergy();
        this.disease = patient.getDisease();
        this.highBloodPressure = patient.getHighBloodPressure();
        this.diabetes = patient.getDiabetes();
        this.medicines = patient.getMedicines();
        this.observations = patient.getObservations();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getCellphone() {
        return cellphone;
    }

    public String getEmail() {
        return email;
    }

    public String getStreet() {
        return street;
    }

    public Integer getNumber() {
        return number;
    }

    public String getComplement() {
        return complement;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public Integer getPostalCode() {
        return postalCode;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public Integer getAge() {
        return age;
    }

    public Double getWeight() {
        return weight;
    }

    public Double getHeight() {
        return height;
    }

    public String getAllergy() {
        return allergy;
    }

    public String getDisease() {
        return disease;
    }

    public Boolean getHighBloodPressure() {
        return highBloodPressure;
    }

    public Boolean getDiabetes() {
        return diabetes;
    }

    public String getMedicines() {
        return medicines;
    }

    public String getObservations() {
        return observations;
    }

    public static Page<PatientDTO> convert(Page<Patient> patients) {
        return patients.map(PatientDTO::new);
    }
}
