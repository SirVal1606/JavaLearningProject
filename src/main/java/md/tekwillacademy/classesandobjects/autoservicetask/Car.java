package md.tekwillacademy.classesandobjects.autoservicetask;

public class Car {
    String marca;
    String colorOfTheCar;
    int numberOfDoors;
    int motorCapacity;
public Car(String marca, String colorOfTheCar, int numberOfDoors, int motorCapacity){
    System.out.println("This is a full contructor with all parameters included");
    this.marca = marca;
    this.colorOfTheCar = colorOfTheCar;
    this.numberOfDoors = numberOfDoors;
    this.motorCapacity = motorCapacity;
    System.out.println("The object is created,bingo!");

}}

