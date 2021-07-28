package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // HINT
// public class Bardy extends Car
// Assuming we had a car brand, called Bardy.
// Create an object of this class, and make it extend another class called Car.
// class Car features include: noOfTires, color.
// Create another class called Person.
// Features of person include: name, age, likeBardy, hasBardy, bardiesOwned(ArrayList)
// In the main method, create a list that will contain a number of people.
// And if a person likes bardy and does not have bardy, then give them a Bardy.



        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Angela", 35, true, false, 0));
        personList.add(new Person("Bred", 39, false, false, 1));
        personList.add(new Person("Charlie", 23, true, true, 2));
        personList.add(new Person("David", 35, true, false, 3));
        personList.add(new Person("Ena", 28, false, false, 0));

        for(Person person: personList){
            if (person.isLikeBardy() && person.isHasBardy()) {
                System.out.println("Woohoo, "+ person.getName() + " You now own a Bardy!");
            } else {
                System.out.println("Sorry " + person.getName() + ", no Bardy for You.");
            }


        }
    }
}
