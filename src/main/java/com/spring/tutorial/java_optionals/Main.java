package com.spring.tutorial.java_optionals;

import java.util.Optional;

public class Main {
    // input cat name
    // lookup cat name in database
    // return cat details

    // return null if not found
    public static Cat findCatByNameNull(String name)
    {
        // getting data from database
        // if nothing found, we can return null
        // but if we return null, then in main, myCat.age print will get null pointer exception

        Cat cat = new Cat(name, 3);
        return cat;
    }

    //returning optional
    public static Optional<Cat> findCatByNameOptional(String name)
    {        
        Cat cat = new Cat(name, 3);
        
        //for sure not null
        // return Optional.of(cat)

        //can be null
        return Optional.ofNullable(cat);
    }

    public static void main(String[] args){
        Optional<Cat> myCat = findCatByNameOptional("tom");
        
        //check if optional is not emmpty or null
        if(myCat.isPresent())
        {
            System.out.println(myCat.get().age);
        }
        else
        {
            System.out.println("Cat not found");
        }

        //or else, if present will retutrn cat or, will return the new created cat
        //parameter of orElse() is evaluated even when myCat is non-empty
        System.out.println(myCat.orElse(new Cat("Unknown", -1)).age);
        //lambda
        System.out.println(myCat.orElseGet(() -> new Cat("Unknown", -1)).age);
        //throw exception
        System.out.println(myCat.orElseThrow());

        //map
        myCat.map(Cat::getAge)
        .orElse(-1);

    }
}
