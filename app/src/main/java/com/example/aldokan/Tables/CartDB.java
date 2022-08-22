package com.example.aldokan.Tables;

public class CartDB {
    private int Cartid;
    private String CartName;
    private double CartPrice;
    private byte[] CartImage;
    private int CartQuantity;

    public CartDB(int cartid, String cartName, double cartPrice, byte[] cartImage, int cartQuantity) {
        Cartid = cartid;
        CartName = cartName;
        CartPrice = cartPrice;
        CartImage = cartImage;
        CartQuantity = cartQuantity;
    }

    public int getCartid() {
        return Cartid;
    }

    public void setCartid(int cartid) {
        Cartid = cartid;
    }

    public String getCartName() {
        return CartName;
    }

    public void setCartName(String cartName) {
        CartName = cartName;
    }

    public double getCartPrice() {
        return CartPrice;
    }

    public void setCartPrice(double cartPrice) {
        CartPrice = cartPrice;
    }

    public byte[] getCartImage() {
        return CartImage;
    }

    public void setCartImage(byte[] cartImage) {
        CartImage = cartImage;
    }

    public int getCartQuantity() {
        return CartQuantity;
    }

    public void setCartQuantity(int cartQuantity) {
        CartQuantity = cartQuantity;
    }
}
