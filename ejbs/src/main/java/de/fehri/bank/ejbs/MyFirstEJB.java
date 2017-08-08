package de.fehri.bank.ejbs;


import javax.ejb.Stateless;
import java.util.Random;

@Stateless
public class MyFirstEJB {


    public int myLuckyNumber() {

        Random randomGenerator = new Random();

        return randomGenerator.nextInt(100);

    }

}
