package com.example.aldokan.Tables;

public class ConfirmOrdersDB {
    private int COid;
    private String COName;
    private String COPhone;
    private String COAddress;
    private String COCity;

    public ConfirmOrdersDB(int COid, String COName, String COPhone, String COAddress, String COCity) {
        this.COid = COid;
        this.COName = COName;
        this.COPhone = COPhone;
        this.COAddress = COAddress;
        this.COCity = COCity;
    }

    public int getCOid() {
        return COid;
    }

    public void setCOid(int COid) {
        this.COid = COid;
    }

    public String getCOName() {
        return COName;
    }

    public void setCOName(String COName) {
        this.COName = COName;
    }

    public String getCOPhone() {
        return COPhone;
    }

    public void setCOPhone(String COPhone) {
        this.COPhone = COPhone;
    }

    public String getCOAddress() {
        return COAddress;
    }

    public void setCOAddress(String COAddress) {
        this.COAddress = COAddress;
    }

    public String getCOCity() {
        return COCity;
    }

    public void setCOCity(String COCity) {
        this.COCity = COCity;
    }
}
