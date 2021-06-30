package com.movierental;

import java.util.ArrayList;
import java.util.List;

public class Customer {
  private String name;
  private Rentals rentals = new Rentals();

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
    Rentals rentals=this.rentals;
    return (new TextStatement().statement(this.name,rentals));
  }

  public  String htmlStatement()
  {
    Rentals rentals=this.rentals;
    return  (new HtmlStatement().htmlStatement(this.name,rentals));
  }
  public int TotalFrequentRenterPoints() {
    int frequentRenterPoints=0;
    for (Rental each : rentals) {
      frequentRenterPoints += each.frequenterPoints();
    }
    return frequentRenterPoints;
  }

  public double TotalAmount()
  {
    double totalAmount = 0;
    for (Rental each : rentals) {
      totalAmount += each.amount();
    }
    return totalAmount;
  }
}

