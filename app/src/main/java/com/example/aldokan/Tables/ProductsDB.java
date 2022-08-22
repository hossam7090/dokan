package com.example.aldokan.Tables;

public class ProductsDB {
    private int Pid;
    private double PPrice;
    private String PName,PCategory;
    private byte[] PImage;
    public ProductsDB() {
    }
    public ProductsDB(int id,String Name,double Price,byte[] Image,String Category) {
        this.Pid = id;
        this.PName = Name;
        this.PPrice = Price;
        this.PImage = Image;
        this.PCategory = Category;
    }
    public ProductsDB(String Name,double Price,byte[] Image,String Category) {
        this.PName = Name;
        this.PPrice = Price;
        this.PImage = Image;
        this.PCategory = Category;
    }


    public ProductsDB(double PPrice, String PName, String PCategory) {
        this.PPrice = PPrice;
        this.PName = PName;
        this.PCategory = PCategory;
    }

    public int getPid() {
        return Pid;
    }

    public void setPid(int pid) {
        Pid = pid;
    }

    public String getPName() {
        return PName;
    }

    public void setPName(String PName) {
        this.PName = PName;
    }

    public double getPPrice() {
        return PPrice;
    }

    public void setPPrice(double PPrice) {
        this.PPrice = PPrice;
    }

    public byte[] getPImage() {
        return PImage;
    }

    public void setPImage(byte[] PImage) {
        this.PImage = PImage;
    }

    public String getPCategory() {
        return PCategory;
    }

    public void setPCategory(String PCategory) {
        this.PCategory = PCategory;
    }
}
