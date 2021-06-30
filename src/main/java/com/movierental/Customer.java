package com.movierental;

import java.util.ArrayList;
import java.util.List;

public class Customer {
  private String name;
  private List<Rental> rentals = new ArrayList<>();

  public Customer(String name) {
    this.name = name;
  }

  public void addRental(Rental arg) {
    rentals.add(arg);
  }

  public String getName() {
    return name;
  }

  public String statement()
  {
    String result = "Rental Record for " + getName() + "\n";

    for (Rental each : rentals) {
      //show figures for this rental
      result += "\t" + each.getMovie().getTitle() + "\t" +
          String.valueOf(each.amount()) + "\n";
    }
    //add footer lines result
    result += "Amount owed is " + String.valueOf(TotalAmount()) + "\n";
    result += "You earned " + String.valueOf(TotalFrequentRenterPoints())
        + " frequent renter points";
    return result;
  }
  public String htmlStatement()
  {
    String result="<h1>Rental Record for <b>" + getName() + "</b></h1><br>";

    for(Rental each : rentals)
    {
      result+=each.getMovie().getTitle()+" "+String.valueOf(each.amount())+"<br>";
    }
    result+="Amount owed is <b>"+String.valueOf(TotalAmount())+"</b><br>";
    result+="You earned <b>"+String.valueOf(TotalFrequentRenterPoints())+"</b> frequent renter points";

    System.out.println(result);
    return result;
  }

  private int TotalFrequentRenterPoints() {
    int frequentRenterPoints=0;
    for (Rental each : rentals) {
      frequentRenterPoints += each.frequenterPoints();
    }
    return frequentRenterPoints;
  }

  private double TotalAmount()
  {
    double totalAmount = 0;
    for (Rental each : rentals) {
      totalAmount += each.amount();
    }
    return totalAmount;
  }


}

