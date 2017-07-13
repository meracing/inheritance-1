package com.rene;

/**
 * Created by RCornella on 13-7-2017.
 */
public class Porsche extends Car {

    public Porsche() {
        super("Porsche", "2Wd", 5, 2, 5, true);

    }

    public void accelerate(int rate) {
        int newVelocity = getCurrentVelocity() + rate;
        if(newVelocity ==0) {
            stop();
        }
        if(newVelocity > 0) {
            changeVelocity(newVelocity, getCurrentDirection());
        }
    }

}
