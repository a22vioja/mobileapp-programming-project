package com.example.project;


import com.google.gson.annotations.SerializedName;
import android.content.Context;
import android.view.View;

@SuppressWarnings("WeakerAccess")
public class Bonsai {
    @SerializedName("Name")
    public String name;
    @SerializedName("ID")
    public String id;
    @SerializedName("Size")
    public String height;

    @SerializedName("Cost")
    public int price;

    @SerializedName("Category")
    public String category;

    @SerializedName("Login")
    public String login;

    @SerializedName("AuxData")
    public String image;



    public Bonsai(String name, String id, String height, int price, String category, String login, String image) {
        this.name = name;
        this.id = id;
        this.height = height;
        this.price = price;
        this.category = category;
        this.login = login;
        this.image = image;
    }

  /*  public String info() {
        String tmp = new String();
        tmp += "Name:" + name + " ID:" + id + "Cost: " + price;
        return tmp;
    }*/

    /*
        public Bonsai(String name, String ID, int size, int price, Context context) {
            super(context);
            this.name = name;
            this.id = id;
            this.height = height;
            this.price = price;
        }

        public Bonsai(String s, String i, Context context) {
            super(context);
            name = "No name";
            id = "No id";
            height = "No height";
            price = 0;
        }
    */
    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public int getPrice() {
        return price;
    }



}

