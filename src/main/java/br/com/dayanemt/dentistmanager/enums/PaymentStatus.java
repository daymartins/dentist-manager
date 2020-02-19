package br.com.dayanemt.dentistmanager.enums;

public enum PaymentStatus {
    PAID,
    AWAITING;

    PaymentStatus() {
    }

    @Override
    public String toString() {
        return name();
    }
}
