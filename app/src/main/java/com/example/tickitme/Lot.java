package com.example.tickitme;

import com.google.android.gms.maps.model.LatLng;

public class Lot{
    String lotName;
    boolean isMeter;
    double ticketPrice;
    boolean PayByPark;
    LatLng position;


    //constructor
    public Lot(String name, boolean issMeter, double xcoord, double ycoord, double ticketPriceIn, boolean PayByParking){
        position = new LatLng(xcoord, ycoord);
        lotName = name;
        isMeter = issMeter;
        ticketPrice = ticketPriceIn;
        PayByPark = PayByParking;
    }


    public String getLotName(){
        return lotName;
    }
    public boolean getisMeter(){
        return isMeter;
    }
    public double getticketPrice(){
        return ticketPrice;
    }
    public boolean getPayByPark(){
        return PayByPark;
    }
    public LatLng getposition(){
        return position;
    }






}
