package com.bl.hotelreservation;

/**
 * @description create Class Hotels in Hotel Reservation system
 *
 */
public class MyHotels {
    //variables
    public String hotelName;
    public int dailyReward;

    /**
     * @description create Constructor for Initializing the variables for Hotel Reservation System
     *
     */
    public MyHotels(String hotelName,int dailyReward) {
        this.hotelName = hotelName;
        this.dailyReward = dailyReward;
    }
}
