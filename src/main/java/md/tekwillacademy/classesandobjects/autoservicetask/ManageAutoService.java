package md.tekwillacademy.classesandobjects.autoservicetask;

public class ManageAutoService {
    public static void main(String[] args) {

        Garage masterLuxObject = new Garage("Str. Calea orheiului 147", 3, 220);
        System.out.println(masterLuxObject.numberOfSpots);

        Garage autoLux = new Garage();
        autoLux.address = "Str. Stefan cel Mare 150";
        autoLux.dimensionSqFt = 250.6;
        autoLux.numberOfSpots = 5;
        System.out.println(autoLux.address);
        System.out.println(autoLux.numberOfSpots);
        System.out.println(autoLux.dimensionSqFt);
        System.out.println("Informatii despre garajul autoLux: adresa "+ autoLux.address +" cu numarul de spatii "
                +autoLux.numberOfSpots +" si dimensiunea "+autoLux.dimensionSqFt);

        Tool hammer01 = new Tool("Hammer");
        System.out.println(hammer01.nameOfTheTool);

        Tool key = new Tool("Lucky key");
        System.out.println(key.nameOfTheTool);

        Worker ionelCelHarnic = new Worker("Ion");
        System.out.println(ionelCelHarnic.pricePerHour);
        ionelCelHarnic.yearsOfExperience =  5;
        System.out.println(ionelCelHarnic.yearsOfExperience);

        Worker marcelCelPuternic = new Worker();

        Car masinaNicoletei = new Car("Ferrari","Red",3,4500);
        System.out.println(masinaNicoletei.marca);

        Car masinaLuiAdrian = new Car("Mercedes","Black",3,5000);
        System.out.println(masinaLuiAdrian.colorOfTheCar);

    }
}
