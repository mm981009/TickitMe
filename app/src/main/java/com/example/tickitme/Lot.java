package com.example.tickitme;

import com.google.android.gms.maps.model.LatLng;

public class Lot{
    String lotName;
    String isMeter;
    String ticketPrice;
    String PayByPark;
    LatLng position;


    //constructor
    public Lot(String name, String issMeter, double xcoord, double ycoord, String ticketPriceIn, String PayByParking){
        position = new LatLng(xcoord, ycoord);
        lotName = name;
        isMeter = issMeter;
        ticketPrice = ticketPriceIn;
        PayByPark = PayByParking;
    }


    public String getLotName(){
        return lotName;
    }
    public String getisMeter(){
        return isMeter;
    }
    public String getticketPrice(){
        return ticketPrice;
    }
    public String getPayByPark(){
        return PayByPark;
    }
    public LatLng getposition(){
        return position;
    }






}
