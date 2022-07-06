package fitnessApp;

import fitnessApp.body.*;

import java.time.LocalDate;
import java.time.Month;

public class Application {
    public static void main(String[] args) {
        OwnerDetails owner1 = new OwnerDetails("Alex","Smith",LocalDate.of(2012, Month.APRIL, 1));
        OwnerDetails owner2 = new OwnerDetails("Bob","Gale",LocalDate.of(2016, Month.FEBRUARY, 14));
        OwnerDetails owner3 = new OwnerDetails("Garry","Windsor",LocalDate.of(2001, Month.NOVEMBER, 2));
        OwnerDetails owner4 = new OwnerDetails("John","Doe",LocalDate.of(2010, Month.MAY, 20));
        OwnerDetails owner5 = new OwnerDetails("Elvis","Priestly",LocalDate.of(1980, Month.MARCH, 15));
        OwnerDetails owner6 = new OwnerDetails("Lesly","Nielsen",LocalDate.of(1935, Month.MARCH, 10));
        OwnerDetails owner7 = new OwnerDetails("James","Bond",LocalDate.of(1945, Month.FEBRUARY, 13));
        OwnerDetails owner8 = new OwnerDetails("Bill","Wisely",LocalDate.of(1975, Month.APRIL, 30));
        OwnerDetails owner9 = new OwnerDetails("Ron","Wisely",LocalDate.of(1978, Month.JULY, 23));
        OwnerDetails owner10 = new OwnerDetails("Fred","Wisely",LocalDate.of(1966, Month.SEPTEMBER, 20));
        OwnerDetails owner11 = new OwnerDetails("Georg","Wisely",LocalDate.of(1985, Month.AUGUST, 13));
        OwnerDetails owner12 = new OwnerDetails("Hansel","Grimm",LocalDate.of(1995, Month.NOVEMBER, 15));
        OwnerDetails owner13= new OwnerDetails("Gretel","Grimm",LocalDate.of(2004, Month.JULY, 18));
        OwnerDetails owner14 = new OwnerDetails("Jim","Carry",LocalDate.of(2006, Month.JUNE, 19));
        OwnerDetails owner15 = new OwnerDetails("Josh","Goldman",LocalDate.of(1999, Month.DECEMBER, 23));
        OwnerDetails owner16 = new OwnerDetails("Fiona","Iowa",LocalDate.of(2001, Month.DECEMBER, 24));
        OwnerDetails owner17 = new OwnerDetails("Laila","Mansour",LocalDate.of(1942, Month.FEBRUARY, 26));
        OwnerDetails owner18= new OwnerDetails("Ahmad","Muhammad",LocalDate.of(1978, Month.AUGUST, 27));
        OwnerDetails owner19= new OwnerDetails("Foma","Kinaev",LocalDate.of(1993, Month.JULY, 14));
        OwnerDetails owner20= new OwnerDetails("Nick","Back",LocalDate.of(1996, Month.APRIL, 18));
        OwnerDetails owner21= new OwnerDetails("Helen","Miren",LocalDate.of(1997, Month.MARCH, 19));
        OwnerDetails owner22= new OwnerDetails("Olga","Ivanova",LocalDate.of(1986, Month.JANUARY, 10));
        OwnerDetails owner23= new OwnerDetails("Julia","Sails",LocalDate.of(1987, Month.SEPTEMBER, 11));
        OwnerDetails owner24= new OwnerDetails("Simon","Band",LocalDate.of(1994, Month.AUGUST, 9));
        OwnerDetails owner25= new OwnerDetails("Garfunkel","Band",LocalDate.of(1997, Month.MARCH, 4));
        OwnerDetails owner26= new OwnerDetails("Zohan","Smith",LocalDate.of(1998, Month.MARCH, 1));

        Membership owner1M = new Membership(owner1, LocalDate.now(), LocalDate.of(2021, Month.APRIL, 18), Type.SINGLE);
        Membership owner2M = new Membership(owner2, LocalDate.now(), LocalDate.of(2027, Month.JULY, 11), Type.FULL);
        Membership owner3M = new Membership(owner3, LocalDate.now(), LocalDate.of(2024, Month.DECEMBER, 15), Type.SINGLE);
        Membership owner4M = new Membership(owner4, LocalDate.now(), LocalDate.of(2023, Month.APRIL, 18), Type.SINGLE);
        Membership owner5M = new Membership(owner5, LocalDate.now(), LocalDate.of(2023, Month.APRIL, 18), Type.DAYTIME);
        Membership owner6M = new Membership(owner6, LocalDate.now(), LocalDate.of(2025, Month.MARCH, 18), Type.SINGLE);
        Membership owner7M = new Membership(owner7, LocalDate.now(), LocalDate.of(2027, Month.JANUARY, 18), Type.FULL);
        Membership owner8M = new Membership(owner8, LocalDate.now(), LocalDate.of(2024, Month.JANUARY, 18), Type.FULL);
        Membership owner9M = new Membership(owner9, LocalDate.now(), LocalDate.of(2023, Month.APRIL, 18), Type.FULL);
        Membership owner10M = new Membership(owner10, LocalDate.now(), LocalDate.of(2025, Month.FEBRUARY, 18), Type.SINGLE);
        Membership owner11M = new Membership(owner11, LocalDate.now(), LocalDate.of(2027, Month.SEPTEMBER, 18), Type.SINGLE);
        Membership owner12M = new Membership(owner12, LocalDate.now(), LocalDate.of(2024, Month.DECEMBER, 18), Type.SINGLE);
        Membership owner13M = new Membership(owner13, LocalDate.now(), LocalDate.of(2026, Month.MARCH, 18), Type.FULL);
        Membership owner14M = new Membership(owner14, LocalDate.now(), LocalDate.of(2025, Month.JANUARY, 18), Type.FULL);
        Membership owner15M = new Membership(owner15, LocalDate.now(), LocalDate.of(2026, Month.MARCH, 18), Type.SINGLE);
        Membership owner16M = new Membership(owner16, LocalDate.now(), LocalDate.of(2023, Month.JANUARY, 18), Type.FULL);
        Membership owner17M = new Membership(owner17, LocalDate.now(), LocalDate.of(2024, Month.DECEMBER, 18), Type.SINGLE);
        Membership owner18M = new Membership(owner18, LocalDate.now(), LocalDate.of(2023, Month.MARCH, 18), Type.FULL);
        Membership owner19M = new Membership(owner19, LocalDate.now(), LocalDate.of(2026, Month.NOVEMBER, 18), Type.SINGLE);
        Membership owner20M = new Membership(owner20, LocalDate.now(), LocalDate.of(2027, Month.SEPTEMBER, 18), Type.FULL);
        Membership owner21M = new Membership(owner21, LocalDate.now(), LocalDate.of(2025, Month.MARCH, 18), Type.SINGLE);
        Membership owner22M = new Membership(owner22, LocalDate.now(), LocalDate.of(2026, Month.JANUARY, 18), Type.FULL);
        Membership owner23M = new Membership(owner23, LocalDate.now(), LocalDate.of(2027, Month.JUNE, 18), Type.SINGLE);
        Membership owner24M = new Membership(owner24, LocalDate.now(), LocalDate.of(2025, Month.JULY, 18), Type.FULL);
        Membership owner25M = new Membership(owner25, LocalDate.now(), LocalDate.of(2025, Month.APRIL, 18), Type.SINGLE);
        Membership owner26M = new Membership(owner26, LocalDate.now(), LocalDate.of(2024, Month.MARCH, 12), Type.FULL);



        Fitness fitness = new Fitness();

        // Expired membership
        fitness.regIn(Zone.GYM, owner1M);

        // Too young
        fitness.regIn(Zone.GYM, owner2M);

        fitness.regIn(Zone.POOL, owner3M);

        fitness.infoFitness();

        // Registered in another zone
        fitness.regIn(Zone.GYM, owner3M);

        // Zone not in membership
        fitness.regIn(Zone.GROUP, owner4M);

        // Time check (change if needed)
        fitness.regIn(Zone.GYM, owner5M);

        fitness.regIn(owner6M, owner7M, owner8M, owner9M, owner10M, owner11M, owner12M, owner13M, owner14M, owner15M, owner16M, owner17M, owner18M, owner19M, owner20M, owner21M, owner22M, owner23M, owner24M);

        // There are no places in the zone
        fitness.regIn(Zone.POOL, owner25M);

        fitness.regIn(Zone.GYM, owner26M);

        // Information about all visitors
        fitness.infoFitness();

        // Fitness close
        fitness.fitnessClose();

        fitness.infoFitness();


















    }
}
