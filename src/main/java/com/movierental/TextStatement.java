package com.movierental;

import java.util.List;

public class TextStatement
{
    public String statement(String customerName, Rentals rentals)
    {
        String result = "Rental Record for " + customerName + "\n";

        for (Rental each : rentals) {
            //show figures for this rental
            result += "\t" + each.getMovie().getTitle() + "\t" +
                    String.valueOf(each.amount()) + "\n";
        }
        //add footer lines result
        result += "Amount owed is " + String.valueOf(rentals.TotalAmount()) + "\n";
        result += "You earned " + String.valueOf(rentals.TotalFrequentRenterPoints())
                + " frequent renter points";
        return result;
    }
}
