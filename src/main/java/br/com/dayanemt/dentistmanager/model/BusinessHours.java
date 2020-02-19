package br.com.dayanemt.dentistmanager.model;

import br.com.dayanemt.dentistmanager.enums.DaysWeek;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
public class BusinessHours {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private br.com.dayanemt.dentistmanager.enums.BusinessHours businessHours;

    @Enumerated(EnumType.STRING)
    private DaysWeek daysWeek;

    private Boolean closed;

    private Boolean twentyFourHours;

    @Temporal(TemporalType.TIMESTAMP)
    private Date startTime;

    @Temporal(TemporalType.TIMESTAMP)
    private Date endTime;

    @ManyToOne
    private SystemParameters systemParameters;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BusinessHours that = (BusinessHours) o;
        return Objects.equals(id, that.id);
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

    public br.com.dayanemt.dentistmanager.enums.BusinessHours getBusinessHours() {
        return businessHours;
    }

    public void setBusinessHours(br.com.dayanemt.dentistmanager.enums.BusinessHours businessHours) {
        this.businessHours = businessHours;
    }

    public DaysWeek getDaysWeek() {
        return daysWeek;
    }

    public void setDaysWeek(DaysWeek daysWeek) {
        this.daysWeek = daysWeek;
    }

    public Boolean getClosed() {
        return closed;
    }

    public void setClosed(Boolean closed) {
        this.closed = closed;
    }

    public Boolean getTwentyFourHours() {
        return twentyFourHours;
    }

    public void setTwentyFourHours(Boolean twentyFourHours) {
        this.twentyFourHours = twentyFourHours;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public SystemParameters getSystemParameters() {
        return systemParameters;
    }

    public void setSystemParameters(SystemParameters systemParameters) {
        this.systemParameters = systemParameters;
    }
}
