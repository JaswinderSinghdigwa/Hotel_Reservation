package com.bl.hotelreservation;

import java.util.ArrayList;
import java.util.List;

/**
 * @description create Class for Hotel Reservation Service in Hotel Reservation System
 *
 */
public class MyHotelReservationService {
    public List<MyHotels> list = new ArrayList<>();     //Created ArrayList for Adding Hotels

    /**
     * @description create Method for Adding the Hotels in Hotel Reservation System
     *
     */
    public void add(MyHotels hotel1) {
        list.add(hotel1);
    }

    /**
     * @description created Getter and Setter for Hotel Reservation System
     *
     */
    public List<MyHotels> getHotels() {
        return list;
    }
    public void setList(List<MyHotels> list) {
        this.list = list;
    }
}
