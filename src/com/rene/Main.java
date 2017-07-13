package com.rene;

public class Main {

    public static void main(String[] args) {
        Outlander outlander = new Outlander(22);
        outlander.steer(15);
        outlander.accelerate(10);
        outlander.accelerate(22);
        outlander.accelerate(-8);
        outlander.steer(15);
        //outlander.stop();

        Porsche porsche =new Porsche();
        porsche.steer(10);
        porsche.accelerate(12);





    }
}
