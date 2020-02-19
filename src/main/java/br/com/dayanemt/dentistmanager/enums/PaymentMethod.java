package br.com.dayanemt.dentistmanager.enums;

public enum PaymentMethod {
    CASH,
    CREDIT_CARD,
    DEBIT_CARD;

    PaymentMethod() {
    }

    @Override
    public String toString() {
        return name();
    }
}
