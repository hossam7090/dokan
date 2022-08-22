package com.example.aldokan;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import com.example.aldokan.Tables.CartDB;
import com.example.aldokan.Tables.ConfirmOrdersDB;
import com.example.aldokan.Tables.CustomersDB;
import com.example.aldokan.Tables.ProductsDB;

import java.util.ArrayList;

public class Database extends SQLiteOpenHelper {
    public static final String DB_name = "Database";
    public static final int DB_Version = 1;
    public static final String Products_Table_Name = "Products";

    public static final String Products_cln_Productsid = "Productsid";
    public static final String Products_cln_ProductsName = "ProductsName";
    public static final String Products_cln_ProductsPrice = "ProductsPrice";
    public static final String Products_cln_ProductsImage = "ProductsImage";
    public static final String Products_cln_ProductsCategory = "ProductsCategory";


    public static final String Customers_Table_Name = "Customers";

    public static final String Customers_cln_Customersid = "Customersid";
    public static final String Customers_cln_CustomersFName = "CustomersFName";
    public static final String Customers_cln_CustomersLName = "CustomersLName";
    public static final String Customers_cln_CustomersPhoneOREmail = "CustomersPhoneOREmail";
    public static final String Customers_cln_CustomersPassword = "CustomersPassword";
    public static final String Customers_cln_CustomersGander = "CustomersGander";


    public static final String Cart_tb_name = "Cart";

    public static final String Cart_cln_Cartid = "Cartid";
    public static final String Cart_cln_CartName = "CartName";
    public static final String Cart_cln_CartPrice = "CartPrice";
    public static final String Cart_cln_CartImage = "CartImage";
    public static final String Cart_cln_CartQuantity = "CartQuantity";


    public static final String ConfirmOrders_Table_Name = "ConfirmOrdersDB";

    public static final String confirmOrder_tb_name = "ConfirmOrders";
    public static final String confirmOrder_cln_COid = "COid";
    public static final String confirmOrder_cln_COName = "COName";
    public static final String confirmOrder_cln_COPhone = "COPhone";
    public static final String confirmOrder_cln_COAddress = "COAddress";
    public static final String confirmOrder_cln_COCity = "COCity";

    public static final String Create_Products_Table =
            "CREATE TABLE " + Products_Table_Name + " (" + Products_cln_Productsid + " INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL," + Products_cln_ProductsName + " TEXT UNIQUE," + Products_cln_ProductsPrice + " REAL NOT NULL," + Products_cln_ProductsImage + " BLOB NOT NULL," + Products_cln_ProductsCategory + " TEXT NOT NULL" + ")";
    public static final String Drop_Products_Table = "DROP TABLE IF EXISTS " + Products_Table_Name;
    public static final String SELECT_Products_Table = "SELECT * FROM " + Products_Table_Name;
    public static final String SELECT_Products_Table_where = "SELECT * FROM " + Products_Table_Name + " WHERE " + Products_cln_ProductsName + "=?";

    public static final String Create_Customers_Table =
            "CREATE TABLE " + Customers_Table_Name + " (" + Customers_cln_Customersid + " INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL," + Customers_cln_CustomersFName + " TEXT NOT NULL," + Customers_cln_CustomersLName + " TEXT NOT NULL," + Customers_cln_CustomersPhoneOREmail + " TEXT UNIQUE," + Customers_cln_CustomersPassword + " blob NOT NULL," + Customers_cln_CustomersGander + " TEXT NOT NULL" + ")";
    public static final String Drop_Customers_Table = "DROP TABLE IF EXISTS " + Customers_Table_Name;
    public static final String SELECT_Customers_Table = "SELECT * FROM " + Customers_Table_Name;
    public static final String SELECT_Customers_Table_Where = "SELECT * FROM " + Customers_Table_Name + " WHERE " + Customers_cln_CustomersPhoneOREmail + "=?";

    public static final String Create_ConfirmOrders_Table =
            "CREATE TABLE " + confirmOrder_tb_name + " (" + confirmOrder_cln_COid + " INTEGER PRIMARY KEY AUTOINCREMENT, " + confirmOrder_cln_COName + " TEXT NOT NULL, " + confirmOrder_cln_COPhone + " TEXT UNIQUE, " + confirmOrder_cln_COAddress + " TEXT NOT NULL, " + confirmOrder_cln_COCity + " TEXT NOT NULL" + ")";
    public static final String Drop_ConfirmOrders_Table = "DROP TABLE IF EXISTS " + ConfirmOrders_Table_Name;
    public static final String SELECT_ConfirmOrders_Table = "SELECT * FROM " + ConfirmOrders_Table_Name;
    public static final String SELECT_ConfirmOrders_Table_Where = "SELECT * FROM " + ConfirmOrders_Table_Name + " WHERE " + confirmOrder_cln_COPhone + "=?";

    public static final String Create_Cart_Table =
            "CREATE TABLE " + Cart_tb_name + " (" + Cart_cln_Cartid + " INTEGER PRIMARY KEY AUTOINCREMENT, " + " " + Cart_cln_CartName + " TEXT UNIQUE, " + Cart_cln_CartPrice + " REAL NOT NULL, " + Cart_cln_CartImage + " BLOB NOT NULL, " + Cart_cln_CartQuantity + " INTEGER NOT NULL" + ")";
    public static final String Drop_Cart_Table = "DROP TABLE IF EXISTS " + Cart_tb_name;
    public static final String SELECT_Cart_Table = "SELECT * FROM " + Cart_tb_name;
    public static final String SELECT_Cart_Table_Where = "SELECT * FROM " + Cart_tb_name + " Where " + Cart_cln_CartName + "=?";


    public Database(Context context) {
        super(context, DB_name, null, DB_Version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(Create_Products_Table);
        sqLiteDatabase.execSQL(Create_Customers_Table);
        sqLiteDatabase.execSQL(Create_Cart_Table);
        sqLiteDatabase.execSQL(Create_ConfirmOrders_Table);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        /*try {
            sqLiteDatabase.execSQL(Drop_Products_Table);
            sqLiteDatabase.execSQL(Drop_Customers_Table);
        }catch (SQLException e){
            e.printStackTrace();
        }*/
        sqLiteDatabase.execSQL(Drop_Products_Table);
        sqLiteDatabase.execSQL(Drop_Customers_Table);
        sqLiteDatabase.execSQL(Drop_Cart_Table);
        sqLiteDatabase.execSQL(Drop_ConfirmOrders_Table);

        onCreate(sqLiteDatabase);
    }

    public boolean insertProduct(ProductsDB Product) {
        SQLiteDatabase db = getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(Products_cln_ProductsName, Product.getPName());
        values.put(Products_cln_ProductsPrice, Product.getPPrice());
        values.put(Products_cln_ProductsImage, Product.getPImage());
        values.put(Products_cln_ProductsCategory, Product.getPCategory());

        long result = db.insert(Products_Table_Name, null, values);
        return result != -1;
    }

    public boolean updateProduct(ProductsDB Product) {
        SQLiteDatabase db = getWritableDatabase();
        ContentValues values = new ContentValues();

        //values.put(Products_cln_ProductsName, Product.getPName());
        values.put(Products_cln_ProductsPrice, Product.getPPrice());
        values.put(Products_cln_ProductsImage, Product.getPImage());
        values.put(Products_cln_ProductsCategory, Product.getPCategory());

        String args[] = {Product.getPName() + ""};
        int result = db.update(Products_Table_Name, values, "ProductsName=?", args);
        return result > 0;
    }


    public boolean deleteProduct(ProductsDB Product) {
        SQLiteDatabase db = getWritableDatabase();
        ContentValues values = new ContentValues();


        String args[] = {Product.getPName() + ""};
        int result = db.delete(Products_Table_Name, "ProductsName=?", args);
        return result > 0;
    }


    public long getProductsCount() {
        SQLiteDatabase db = getReadableDatabase();
        return DatabaseUtils.queryNumEntries(db,Products_Table_Name);
    }


    public ArrayList<ProductsDB> getAllProducts() {
        ArrayList<ProductsDB> products = new ArrayList<>();
        SQLiteDatabase db = getReadableDatabase();
        Cursor cursor = db.rawQuery(SELECT_Products_Table, null);


        if (cursor != null && cursor.moveToFirst()) {
            do {
                int i1 = cursor.getColumnIndex(Products_cln_Productsid);
                int i2 = cursor.getColumnIndex(Products_cln_ProductsName);
                int i3 = cursor.getColumnIndex(Products_cln_ProductsPrice);
                int i4 = cursor.getColumnIndex(Products_cln_ProductsImage);
                int i5 = cursor.getColumnIndex(Products_cln_ProductsCategory);
                int id = cursor.getInt(i1);
                String name = cursor.getString(i2);
                double price = cursor.getDouble(i3);
                String category = cursor.getString(i4);
                byte[] img = cursor.getBlob(i5);

                ProductsDB product = new ProductsDB(id, name, price, img,category);
                products.add(product);
            } while (cursor.moveToNext());
            cursor.close();
        }
        return products;
    }


    public ArrayList<ProductsDB> getProducts(String NameSearch) {
        ArrayList<ProductsDB> products = new ArrayList<>();
        SQLiteDatabase db = getReadableDatabase();
        Cursor cursor = db.rawQuery(SELECT_Products_Table_where, new String[] {NameSearch});


        if (cursor.moveToFirst()) {
            do {
                int i1 = cursor.getColumnIndex(Products_cln_Productsid);
                int i2 = cursor.getColumnIndex(Products_cln_ProductsName);
                int i3 = cursor.getColumnIndex(Products_cln_ProductsPrice);
                int i4 = cursor.getColumnIndex(Products_cln_ProductsImage);
                int i5 = cursor.getColumnIndex(Products_cln_ProductsCategory);
                int id = cursor.getInt(i1);
                String name = cursor.getString(i2);
                double price = cursor.getDouble(i3);
                String category = cursor.getString(i4);
                byte[] img = cursor.getBlob(i5);

                ProductsDB Product = new ProductsDB(id, name, price, img,category);
                products.add(Product);
            } while (cursor.moveToNext());
            cursor.close();
        }
        return products;
    }



    public boolean insertCustomer(CustomersDB Customer) {
        SQLiteDatabase db =this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(Customers_cln_CustomersFName, Customer.getCFname());
        values.put(Customers_cln_CustomersLName, Customer.getCLName());
        values.put(Customers_cln_CustomersPhoneOREmail, Customer.getCPhoneOREmail());
        values.put(Customers_cln_CustomersPassword, Customer.getCPassword());
        values.put(Customers_cln_CustomersGander, Customer.getCGander());

        long result = db.insert(Customers_Table_Name, null, values);
        return result != -1;
    }

    public boolean updateCustomer(CustomersDB Customer) {
        SQLiteDatabase db = getWritableDatabase();
        ContentValues values = new ContentValues();

        values.put(Customers_cln_CustomersFName, Customer.getCFname());
        values.put(Customers_cln_CustomersLName, Customer.getCLName());
        //values.put(Customers_cln_CustomersPhoneOREmail, Customer.getCPhoneOREmail());
        values.put(Customers_cln_CustomersPassword, Customer.getCPassword());
        values.put(Customers_cln_CustomersGander, Customer.getCGander());

        String args[] = {Customer.getCPhoneOREmail() + ""};
        int result = db.update(Customers_Table_Name, values, "CustomersPhoneOREmail=?", args);
        return result > 0;
    }


    public boolean deleteCustomer(CustomersDB Customer) {
        SQLiteDatabase db = getWritableDatabase();
        ContentValues values = new ContentValues();


        String args[] = {Customer.getCPhoneOREmail() + ""};
        int result = db.delete(Customers_Table_Name, "CustomersPhoneOREmail=?", args);
        return result > 0;
    }


    public long getCustomersCount() {
        SQLiteDatabase db = getReadableDatabase();
        return DatabaseUtils.queryNumEntries(db,Customers_Table_Name);
    }


    public ArrayList<CustomersDB> getAllCustomers() {
        ArrayList<CustomersDB> customers = new ArrayList<>();
        SQLiteDatabase db = getReadableDatabase();
        Cursor cursor = db.rawQuery(SELECT_Customers_Table, null);


        if (cursor != null && cursor.moveToFirst()) {
            do {
                int i1 = cursor.getColumnIndex(Customers_cln_Customersid);
                int i2 = cursor.getColumnIndex(Customers_cln_CustomersFName);
                int i3 = cursor.getColumnIndex(Customers_cln_CustomersLName);
                int i4 = cursor.getColumnIndex(Customers_cln_CustomersPhoneOREmail);
                int i5 = cursor.getColumnIndex(Customers_cln_CustomersPassword);
                int i6 = cursor.getColumnIndex(Customers_cln_CustomersGander);
                int id = cursor.getInt(i1);
                String fname = cursor.getString(i2);
                String lname = cursor.getString(i3);
                String phoneORemail = cursor.getString(i4);
                String password = cursor.getString(i5);
                String gander = cursor.getString(i6);

                CustomersDB customer = new CustomersDB(id, fname, lname, phoneORemail,password,gander);
                customers.add(customer);
            } while (cursor.moveToNext());
            cursor.close();
        }
        return customers;
    }


    public ArrayList<CustomersDB> getCustomer(String NameSearch) {
        ArrayList<CustomersDB> customers = new ArrayList<>();
        SQLiteDatabase db = getReadableDatabase();
        Cursor cursor = db.rawQuery(SELECT_Customers_Table_Where, new String[] {NameSearch});


        if (cursor.moveToFirst()) {
            do {
                int i1 = cursor.getColumnIndex(Customers_cln_Customersid);
                int i2 = cursor.getColumnIndex(Customers_cln_CustomersFName);
                int i3 = cursor.getColumnIndex(Customers_cln_CustomersLName);
                int i4 = cursor.getColumnIndex(Customers_cln_CustomersPhoneOREmail);
                int i5 = cursor.getColumnIndex(Customers_cln_CustomersPassword);
                int i6 = cursor.getColumnIndex(Customers_cln_CustomersGander);
                int id = cursor.getInt(i1);
                String fname = cursor.getString(i2);
                String lname = cursor.getString(i3);
                String phoneORemail = cursor.getString(i4);
                String password = cursor.getString(i5);
                String gander = cursor.getString(i6);

                CustomersDB customer = new CustomersDB(id, fname, lname, phoneORemail,password,gander);
                customers.add(customer);
            } while (cursor.moveToNext());
            cursor.close();
        }
        return customers;
    }

    public boolean insertConfirmOrder(ConfirmOrdersDB Confirm) {
        SQLiteDatabase db = getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(confirmOrder_tb_name, Confirm.getCOName());
        values.put(confirmOrder_cln_COPhone, Confirm.getCOPhone());
        values.put(confirmOrder_cln_COAddress, Confirm.getCOAddress());
        values.put(confirmOrder_cln_COCity, Confirm.getCOCity());

        long result = db.insert(ConfirmOrders_Table_Name, null, values);
        return result != -1;
    }

    public boolean updateConfirmOrder(ConfirmOrdersDB Confirm) {
        SQLiteDatabase db = getWritableDatabase();
        ContentValues values = new ContentValues();

        //values.put(confirmOrder_tb_name, Confirm.getCOName());
        values.put(confirmOrder_cln_COPhone, Confirm.getCOPhone());
        values.put(confirmOrder_cln_COAddress, Confirm.getCOAddress());
        values.put(confirmOrder_cln_COCity, Confirm.getCOCity());

        String args[] = {Confirm.getCOName() + ""};
        int result = db.update(ConfirmOrders_Table_Name, values, "COName=?", args);
        return result > 0;
    }


    public boolean deleteConfirm(ConfirmOrdersDB Confirm) {
        SQLiteDatabase db = getWritableDatabase();
        ContentValues values = new ContentValues();


        String args[] = {Confirm.getCOName() + ""};
        int result = db.delete(ConfirmOrders_Table_Name, "COName=?", args);
        return result > 0;
    }


    public long getConfirmOrdersCount() {
        SQLiteDatabase db = getReadableDatabase();
        return DatabaseUtils.queryNumEntries(db,ConfirmOrders_Table_Name);
    }


    public ArrayList<ConfirmOrdersDB> getAllConfirmOrder() {
        ArrayList<ConfirmOrdersDB> confirms = new ArrayList<>();
        SQLiteDatabase db = getReadableDatabase();
        Cursor cursor = db.rawQuery(SELECT_ConfirmOrders_Table, null);


        if (cursor != null && cursor.moveToFirst()) {
            do {
                int i1 = cursor.getColumnIndex(confirmOrder_cln_COid);
                int i2 = cursor.getColumnIndex(confirmOrder_cln_COName);
                int i3 = cursor.getColumnIndex(confirmOrder_cln_COPhone);
                int i4 = cursor.getColumnIndex(confirmOrder_cln_COAddress);
                int i5 = cursor.getColumnIndex(confirmOrder_cln_COCity);
                int id = cursor.getInt(i1);
                String name = cursor.getString(i2);
                String phone = cursor.getString(i3);
                String address = cursor.getString(i4);
                String city = cursor.getString(i5);

                ConfirmOrdersDB confirm = new ConfirmOrdersDB(id, name, phone, address,city);
                confirms.add(confirm);
            } while (cursor.moveToNext());
            cursor.close();
        }
        return confirms;
    }


    public ArrayList<ConfirmOrdersDB> getConfirmorder(String phoneSearch) {
        ArrayList<ConfirmOrdersDB> Confirmorders = new ArrayList<>();
        SQLiteDatabase db = getReadableDatabase();
        Cursor cursor = db.rawQuery(SELECT_ConfirmOrders_Table_Where, new String[] {phoneSearch});


        if (cursor.moveToFirst()) {
            do {
                int i1 = cursor.getColumnIndex(confirmOrder_cln_COid);
                int i2 = cursor.getColumnIndex(confirmOrder_cln_COName);
                int i3 = cursor.getColumnIndex(confirmOrder_cln_COPhone);
                int i4 = cursor.getColumnIndex(confirmOrder_cln_COAddress);
                int i5 = cursor.getColumnIndex(confirmOrder_cln_COCity);
                int id = cursor.getInt(i1);
                String name = cursor.getString(i2);
                String phone = cursor.getString(i3);
                String address = cursor.getString(i4);
                String city = cursor.getString(i5);

                ConfirmOrdersDB confirmorder = new ConfirmOrdersDB(id, name, phone, address,city);
                Confirmorders.add(confirmorder);
            } while (cursor.moveToNext());
            cursor.close();
        }
        return Confirmorders;
    }



    public boolean insertCart(CartDB Cart) {
        SQLiteDatabase db = getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(Cart_cln_CartName, Cart.getCartName());
        values.put(Cart_cln_CartPrice, Cart.getCartPrice());
        values.put(Cart_cln_CartImage, Cart.getCartImage());
        values.put(Cart_cln_CartQuantity, Cart.getCartQuantity());

        long result = db.insert(Cart_tb_name, null, values);
        return result != -1;
    }

    public boolean updateCart(CartDB Cart) {
        SQLiteDatabase db = getWritableDatabase();
        ContentValues values = new ContentValues();

        //values.put(Cart_cln_CartName, Cart.getCartName());
        values.put(Cart_cln_CartPrice, Cart.getCartPrice());
        values.put(Cart_cln_CartImage, Cart.getCartImage());
        values.put(Cart_cln_CartQuantity, Cart.getCartQuantity());

        String args[] = {Cart.getCartName() + ""};
        int result = db.update(Products_Table_Name, values, "CartName=?", args);
        return result > 0;
    }


    public boolean deleteCart(CartDB Cart) {
        SQLiteDatabase db = getWritableDatabase();
        ContentValues values = new ContentValues();


        String args[] = {Cart.getCartName() + ""};
        int result = db.delete(Cart_tb_name, "CartName=?", args);
        return result > 0;
    }


    public long getCartCount() {
        SQLiteDatabase db = getReadableDatabase();
        return DatabaseUtils.queryNumEntries(db, Cart_tb_name);
    }


    public ArrayList<CartDB> getAllCart() {
        ArrayList<CartDB> Cart = new ArrayList<>();
        SQLiteDatabase db = getReadableDatabase();
        Cursor cursor = db.rawQuery(SELECT_Cart_Table, null);


        if (cursor != null && cursor.moveToFirst()) {
            do {
                int i1 = cursor.getColumnIndex(Cart_cln_Cartid);
                int i2 = cursor.getColumnIndex(Cart_cln_CartName);
                int i3 = cursor.getColumnIndex(Cart_cln_CartPrice);
                int i4 = cursor.getColumnIndex(Cart_cln_CartImage);
                int i5 = cursor.getColumnIndex(Cart_cln_CartQuantity);
                int id = cursor.getInt(i1);
                String name = cursor.getString(i2);
                double price = cursor.getDouble(i3);
                byte[] img = cursor.getBlob(i4);
                int quantity = cursor.getInt(i5);

                CartDB cart = new CartDB(id, name, price, img, quantity);
                Cart.add(cart);
            } while (cursor.moveToNext());
            cursor.close();
        }
        return Cart;
    }


    public ArrayList<CartDB> getCart(String NameSearch) {
        ArrayList<CartDB> Carts = new ArrayList<>();
        SQLiteDatabase db = getReadableDatabase();
        Cursor cursor = db.rawQuery(SELECT_Cart_Table_Where, new String[]{NameSearch});


        if (cursor.moveToFirst()) {
            do {
                int i1 = cursor.getColumnIndex(Cart_cln_Cartid);
                int i2 = cursor.getColumnIndex(Cart_cln_CartName);
                int i3 = cursor.getColumnIndex(Cart_cln_CartPrice);
                int i4 = cursor.getColumnIndex(Cart_cln_CartImage);
                int i5 = cursor.getColumnIndex(Cart_cln_CartQuantity);
                int id = cursor.getInt(i1);
                String name = cursor.getString(i2);
                double price = cursor.getDouble(i3);
                byte[] img = cursor.getBlob(i4);
                int quantity = cursor.getInt(i5);

                CartDB cart = new CartDB(id, name, price, img, quantity);
                Carts.add(cart);
            } while (cursor.moveToNext());
            cursor.close();
        }
        return Carts;
    }

}