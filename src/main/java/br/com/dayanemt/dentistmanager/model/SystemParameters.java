package br.com.dayanemt.dentistmanager.model;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
public class SystemParameters {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String telephone;

    private String email;

    private String address;

    private String cro;

    private String dentistName;

    private String dentistScholarity;

    private String dentistPhotoUrl;

    private String instagram;

    private String facebook;

    private String linkedin;

    private String youtube;

    @OneToMany(mappedBy = "systemParameters")
    private List<BusinessHours> businessHours;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SystemParameters systemParameters = (SystemParameters) o;
        return Objects.equals(id, systemParameters.id);
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

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCro() {
        return cro;
    }

    public void setCro(String cro) {
        this.cro = cro;
    }

    public String getDentistName() {
        return dentistName;
    }

    public void setDentistName(String dentistName) {
        this.dentistName = dentistName;
    }

    public String getDentistScholarity() {
        return dentistScholarity;
    }

    public void setDentistScholarity(String dentistScholarity) {
        this.dentistScholarity = dentistScholarity;
    }

    public String getDentistPhotoUrl() {
        return dentistPhotoUrl;
    }

    public void setDentistPhotoUrl(String dentistPhotoUrl) {
        this.dentistPhotoUrl = dentistPhotoUrl;
    }

    public String getInstagram() {
        return instagram;
    }

    public void setInstagram(String instagram) {
        this.instagram = instagram;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public String getLinkedin() {
        return linkedin;
    }

    public void setLinkedin(String linkedin) {
        this.linkedin = linkedin;
    }

    public String getYoutube() {
        return youtube;
    }

    public void setYoutube(String youtube) {
        this.youtube = youtube;
    }

    public List<BusinessHours> getBusinessHours() {
        return businessHours;
    }

    public void setBusinessHours(List<BusinessHours> businessHours) {
        this.businessHours = businessHours;
    }
}
