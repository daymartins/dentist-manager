package br.com.dayanemt.dentistmanager.enums;

public enum DaysWeek {

    DOMINGO(1),
    SEGUNDA(2),
    TERCA(3),
    QUARTA(4),
    QUINTA(5),
    SEXTA(6),
    SABADO(7);

    int calendarCode;

    private DaysWeek(int calendarCode) {
        this.calendarCode = calendarCode;
    }

    @Override
    public String toString() {
        return name();
    }
}
