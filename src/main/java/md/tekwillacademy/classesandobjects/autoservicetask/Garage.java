package md.tekwillacademy.classesandobjects.autoservicetask;

public class Garage {
    String address;
    int numberOfSpots;
    double dimensionSqFt;

//definire constructor
    public Garage(String addressUsedForInitialization, int numberOfSpots, double dimensionSqFt ){
        address = addressUsedForInitialization;
        this.numberOfSpots = numberOfSpots;
        this.dimensionSqFt = dimensionSqFt;
    }
    public Garage(){
        System.out.println("A fost creat un obiect care nu are nici un paramentru populat cu date concrete " +
                "acesta este un constructor definit fara paramentri");
    }

}
