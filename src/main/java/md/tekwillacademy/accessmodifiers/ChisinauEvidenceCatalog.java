package md.tekwillacademy.accessmodifiers;

import md.tekwillacademy.accessmodifiers.peopleevidence.Person;

public class ChisinauEvidenceCatalog    {
    public static void main(String[] args) {

        Person ionelBaiatGrozav = new Person();

        Person marcelBoy = new Person("Marcel Bivol", 746197556, 65, "Unknown");

        System.out.println(marcelBoy.name);

        ionelBaiatGrozav.name = "Ion Bostanel";
        marcelBoy.name = "Marcel Bivol";

        Person raisaPacalo = new Person ("Raisa Pacalo","Female");
        System.out.println(raisaPacalo.name);

        System.out.println(Person.nationality);
        Person.nationality = "Moldovean";
        System.out.println(Person.nationality);


    }
}
