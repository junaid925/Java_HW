package com.example.junaid.funfacts;


import java.util.Random;

public class FactBook {

    //Field or member veriable -- properties about the object
    private String [] mFacts = {
            "Ants stretch when they wake up in the morning.",
            "Ostriches can run faster than horses.",
            "Olympic gold medals are actually made mostly of silver.",
            "You are born with 300 bones; by the time you are an adult you will have 206.",
            "It takes about 8 minutes for light from the Sun to reach Earth.",
            "Some bamboo plants can grow almost a meter in just one day.",
            "The state of Florida is bigger than England.",
            "Some penguins can leap 2-3 meters out of the water.",
            "On average, it takes 66 days to form a new habit.",
            "Mammoths still walked the earth when the Great Pyramid was being built." };

    //Method - action the object can take
    public String getFacts () {
        String fact ="";

        //randomly select the text
        Random random = new Random();
        int randomNumber = random.nextInt(mFacts.length);
        fact = mFacts[randomNumber];

        return fact ;

    }

}
