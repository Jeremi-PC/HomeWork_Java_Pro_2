package org.example.bike;

import java.lang.reflect.Type;

public class Bike {
    private Type type;
    private String brand;
    private int gearCount;
    private int wheelSize;
    private String color;

    public Type getType() {
        return type;
    }

    public String getBrand() {
        return brand;
    }

    public int getGearCount() {
        return gearCount;
    }

    public int getWheelSize() {
        return wheelSize;
    }

    public String getColor() {
        return color;
    }

    public Bike(Type type, String brand, int gearCount, int wheelSize, String color) {
        this.type = type;
        this.brand = brand;
        this.gearCount = gearCount;
        this.wheelSize = wheelSize;
        this.color = color;
    }
    public void printBike(){
        System.out.println("Type: "+ type + "; Brand: "+ brand +"; Gear count: "+ gearCount+ "; Wheel size: "+wheelSize+"; Color: "+color);
    }

    @Override
    public String toString() {
        return "Bike{" +
                "type=" + type +
                ", brand='" + brand + '\'' +
                ", gearCount=" + gearCount +
                ", wheelSize=" + wheelSize +
                ", color='" + color + '\'' +
                '}';
    }
}
