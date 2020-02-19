package br.com.dayanemt.dentistmanager.enums;

public enum ProcedureCategory {

    PERIODONTICS,
    PEDIATRIC,
    AESTHETICS,
    DENTISTRY,
    ORTHODONTICS,
    PROSTHESIS;

    ProcedureCategory() {
    }

    @Override
    public String toString() {
        return name();
    }
}
