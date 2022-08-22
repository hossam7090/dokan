package com.example.aldokan.Tables;

public class CustomersDB {
    private int Cid;
    private String CFname, CLName, CPhoneOREmail, CPassword, CGander;

    public CustomersDB() {
    }

    public CustomersDB(int id, String FName, String LName, String PhoneOREmail, String Password, String Gander) {
        this.Cid = id;
        this.CFname = FName;
        this.CLName = LName;
        this.CPhoneOREmail = PhoneOREmail;
        this.CPassword = Password;
        this.CGander = Gander;
    }

    public CustomersDB(String FName, String LName, String PhoneOREmail, String Password, String Gander) {
        this.CFname = FName;
        this.CLName = LName;
        this.CPhoneOREmail = PhoneOREmail;
        this.CPassword = Password;
        this.CGander = Gander;
    }

    public CustomersDB(String PhoneOREmail, String Password) {
        this.CPhoneOREmail = PhoneOREmail;
        this.CPassword = Password;
    }

    public int getCid() {
        return Cid;
    }

    public void setCid(int cid) {
        Cid = cid;
    }

    public String getCFname() {
        return CFname;
    }

    public void setCFname(String CFname) {
        this.CFname = CFname;
    }

    public String getCLName() {
        return CLName;
    }

    public void setCLName(String CLName) {
        this.CLName = CLName;
    }

    public String getCPhoneOREmail() {
        return CPhoneOREmail;
    }

    public void setCPhoneOREmail(String CPhoneOREmail) {
        this.CPhoneOREmail = CPhoneOREmail;
    }

    public String getCPassword() {
        return CPassword;
    }

    public void setCPassword(String CPassword) {
        this.CPassword = CPassword;
    }

    public String getCGander() {
        return CGander;
    }

    public void setCGander(String CGander) {
        this.CGander = CGander;
    }
}
