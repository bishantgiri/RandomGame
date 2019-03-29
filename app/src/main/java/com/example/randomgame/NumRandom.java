package com.example.randomgame;

import java.util.Random;

public class NumRandom {

    int minRange=1;
    int maxRange=100;

    public int getMinRange() {
        return minRange;
    }

    public void setMinRange(int minRange) {
        this.minRange = minRange;
    }

    public int getMaxRange() {
        return maxRange;
    }

    public void setMaxRange(int maxRange) {
        this.maxRange = maxRange;
    }

    Random rand=new Random();

    public int getValue(){
        int value = rand.nextInt(maxRange - minRange) + minRange;
        return value;

    }
    public int getValue1(){
        int value1 = rand.nextInt(maxRange - minRange) + minRange;
        return value1;

    }

}
