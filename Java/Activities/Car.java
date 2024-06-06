package org.example;

public class Car {
    String color;
    String transmission;
    int make;
    int tyres;
    int doors;


    Car() {
        doors = 4;
        tyres = 4;

    }
    public void displayCharacteristics(){
        System.out.println("Display's the color:"+color );
        System.out.println("Display's the transmission:"+transmission );
        System.out.println("Display's the tyres:"+tyres );
        System.out.println("Display's the doors:"+doors );
        System.out.println("Display's the make:"+make );
    }

    public void accelarate(){
        System.out.println("Car is moving forward." );

    }
    public void brake(){
        System.out.println("Car has stopped." );

    }
}
