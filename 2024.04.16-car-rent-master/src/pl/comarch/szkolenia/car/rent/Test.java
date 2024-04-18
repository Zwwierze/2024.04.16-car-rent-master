package pl.comarch.szkolenia.car.rent;

import pl.comarch.szkolenia.car.rent.model.Car;

public class Test {
    public static void main(String[] args) {
        final int LICZBA_PI = 5;

        final Car CAR =
                new Car("BMW", "3",
                        "KR", 30.0);

        System.out.println(CAR.getBrand());
        System.out.println(CAR.getModel());
        System.out.println(CAR.getPrice());

        CAR.setBrand("Toyota");

        System.out.println(CAR.getBrand());
        System.out.println(CAR.getModel());
        System.out.println(CAR.getPrice());

        //CAR = new Car();

        Dog dog1 = new Dog();
        dog1.name = "Reksio";
        Dog.race = "Kundel";

        Dog dog2 = new Dog();
        dog2.name = "Rex";
        Dog.race = "Owczaerk";

        System.out.println(dog1.name);
        System.out.println(Dog.race);

        System.out.println(dog2.name);
        System.out.println(Dog.race);
    }
}
