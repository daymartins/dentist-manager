package br.com.dayanemt.dentistmanager.enums;

import java.text.NumberFormat;

public enum BusinessHours {
    _0000(0, 0),
    _0030(0, 30),
    _0100(1, 0),
    _0130(1, 30),
    _0200(2, 0),
    _0230(2, 30),
    _0300(3, 0),
    _0330(3, 30),
    _0400(4, 0),
    _0430(4, 30),
    _0500(5, 0),
    _0530(5, 30),
    _0600(6, 0),
    _0630(6, 30),
    _0700(7, 0),
    _0730(7, 30),
    _0800(8, 0),
    _0830(8, 30),
    _0900(9, 0),
    _0930(9, 30),
    _1000(10, 0),
    _1030(10, 30),
    _1100(11, 0),
    _1130(11, 30),
    _1200(12, 0),
    _1230(12, 30),
    _1300(13, 0),
    _1330(13, 30),
    _1400(14, 0),
    _1430(14, 30),
    _1500(15, 0),
    _1530(15, 30),
    _1600(16, 0),
    _1630(16, 30),
    _1700(17, 0),
    _1730(17, 30),
    _1800(18, 0),
    _1830(18, 30),
    _1900(19, 0),
    _1930(19, 30),
    _2000(20, 0),
    _2030(20, 30),
    _2100(21, 0),
    _2130(21, 30),
    _2200(22, 0),
    _2230(22, 30),
    _2300(23, 0),
    _2330(23, 30);

    int hour;
    int minute;

    private BusinessHours(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
    }

    @Override
    public String toString() {
        NumberFormat nf = NumberFormat.getIntegerInstance();
        return nf.format(hour) + ":" + nf.format(minute);
    }
}
