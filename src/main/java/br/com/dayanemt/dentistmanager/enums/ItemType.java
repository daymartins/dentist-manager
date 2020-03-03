package br.com.dayanemt.dentistmanager.enums;

public enum ItemType {
    SURGICAL;

    ItemType() {
    }

    @Override
    public String toString() {
        return name();
    }
}
