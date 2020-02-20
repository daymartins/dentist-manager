package br.com.dayanemt.dentistmanager.controller.dto;

public class DashboardDTO {

    private Integer appointmentsToday;
    private Integer treatsMonth;
    private Integer paymentsPending;

    public Integer getAppointmentsToday() {
        return appointmentsToday;
    }

    public void setAppointmentsToday(Integer appointmentsToday) {
        this.appointmentsToday = appointmentsToday;
    }

    public Integer getTreatsMonth() {
        return treatsMonth;
    }

    public void setTreatsMonth(Integer treatsMonth) {
        this.treatsMonth = treatsMonth;
    }

    public Integer getPaymentsPending() {
        return paymentsPending;
    }

    public void setPaymentsPending(Integer paymentsPending) {
        this.paymentsPending = paymentsPending;
    }
}
