package com.movierental;

public class HtmlStatement
{
    public String htmlStatement(String customerName, Rentals rentals)
    {
        String result="<h1>Rental Record for <b>" + customerName + "</b></h1><br>";

        for(Rental each : rentals)
        {
            result+=each.getMovie().getTitle()+" "+String.valueOf(each.amount())+"<br>";
        }
        result+="Amount owed is <b>"+String.valueOf(rentals.TotalAmount())+"</b><br>";
        result+="You earned <b>"+String.valueOf(rentals.TotalFrequentRenterPoints())+"</b> frequent renter points";

        return result;
    }
}
