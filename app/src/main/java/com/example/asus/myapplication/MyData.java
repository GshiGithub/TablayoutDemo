package com.example.asus.myapplication;

/**
 * Created by ASUS on 2017/12/20.
 */

public class MyData {
    private String name ;
    private String number;
    private int  uri;

    public MyData(String name, String number, int  uri)
    {
        this.name = name;
        this.number = number;
        this.uri = uri;
    }
    public String getName(){
        return this.name;
    }
    public String getNumber(){return number;};
    public int  getUri(){return uri;};
}
