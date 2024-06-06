package org.example;

public  class Activity1{
    public static void main(String[] args) {
        Car volvo =new Car();
        volvo.color="Black";
        volvo.transmission="Manual";
        volvo.make=2014;
        volvo.displayCharacteristics();
        volvo.accelarate();
        volvo.brake();
    }
}

