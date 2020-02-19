package br.com.dayanemt.dentistmanager.enums;

public enum ProcedureLocation {
    FACE,
    MOUTH;

    ProcedureLocation() {
    }

    @Override
    public String toString() {
        return name();
    }
}
