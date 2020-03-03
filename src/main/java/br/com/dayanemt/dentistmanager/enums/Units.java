package br.com.dayanemt.dentistmanager.enums;

public enum Units {
    ML,
    MG,
    UN;

    Units() {
    }

    @Override
    public String toString() {
        return name();
    }
}
