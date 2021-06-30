package com.movierental;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class CustomerTest {
    @Test
    public void baseTest()
    {
        Movie m1 = new Movie("Movie 1",0);
        Movie m2 = new Movie("Movie 2",1);
        Movie m3 = new Movie("Movie 3",2);

        Rental r1 = new Rental(m1,1);
        Rental r2 = new Rental(m1,3);
        Rental r3 = new Rental(m2,1);
        Rental r4 = new Rental(m2,4);
        Rental r5 = new Rental(m3,2);
        Rental r6 = new Rental(m3,5);

        Customer customer = new Customer("Shivam");
        customer.addRental(r1);customer.addRental(r2);customer.addRental(r3);
        customer.addRental(r4);customer.addRental(r5);customer.addRental(r6);

        String  resultStatement=customer.statement();
        String expectedStatement="Rental Record for Shivam\n" +
                "\tMovie 1\t2.0\n" +
                "\tMovie 1\t3.5\n" +
                "\tMovie 2\t3.0\n" +
                "\tMovie 2\t12.0\n" +
                "\tMovie 3\t1.5\n" +
                "\tMovie 3\t4.5\n" +
                "Amount owed is 26.5\n" +
                "You earned 7 frequent renter points";

        assertEquals(expectedStatement,resultStatement);






    }

}