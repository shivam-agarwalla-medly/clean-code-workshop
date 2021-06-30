package com.movierental;

import java.util.ArrayList;
import java.util.List;

public class Rentals extends  ArrayList<Rental>
{
    public int TotalFrequentRenterPoints() {
        int frequentRenterPoints=0;
        for (Rental each : this) {
            frequentRenterPoints += each.frequenterPoints();
        }
        return frequentRenterPoints;
    }

    public double TotalAmount()
    {
        double totalAmount = 0;
        for (Rental each : this) {
            totalAmount += each.amount();
        }
        return totalAmount;
    }
}
