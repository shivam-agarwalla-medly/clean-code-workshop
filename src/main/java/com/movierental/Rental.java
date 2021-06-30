package com.movierental;

public class Rental {

  private int daysRented;
  private Movie movie;

  public Rental(Movie movie, int daysRented){
    this.movie = movie;
    this.daysRented = daysRented;
  }

  public int getDaysRented() {
    return daysRented;
  }

  public Movie getMovie() {
    return movie;
  }

  public int frequenterPoints()
  {
    int points=1;
    if(isBonusApplicable())points++;
    return  points;
  }

  private boolean isBonusApplicable()
  {
    if((movie.getPriceCode()==Movie.NEW_RELEASE) && getDaysRented()>1)
      return true;

    return false;
  }

  public double amount()
  {
    double thisAmount=0;

    switch (getMovie().getPriceCode()) {
      case Movie.REGULAR:
        thisAmount += 2;
        if (getDaysRented() > 2)
          thisAmount += (getDaysRented() - 2) * 1.5;
        break;
      case Movie.NEW_RELEASE:
        thisAmount += getDaysRented() * 3;
        break;
      case Movie.CHILDRENS:
        thisAmount += 1.5;
        if (getDaysRented() > 3)
          thisAmount += (getDaysRented() - 3) * 1.5;
        break;
    }
    return  thisAmount;
  }
}