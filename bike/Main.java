package org.example.bike;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Bike bike = new Bike(Type.CROSSBIKE, "Treck",7,21,"blue");
        Bike bike1 = new Bike(Type.MOUNTAINEBIKE, "CUBE",21,19,"white");
        Bike bike2 = new Bike(Type.CHILDRENBICYCLE, "Strider",1,12,"green");

        bike.printBike();
        bike1.printBike();
        bike2.printBike();

        Bike[] bikes = {bike, bike1, bike2};
        System.out.println(Arrays.toString(bikes));
        //-------------------------------
        System.out.println(Arrays.toString(bikes));

        // I think bike becomes string at this point: String.valueOf(a[i])
    }
}
