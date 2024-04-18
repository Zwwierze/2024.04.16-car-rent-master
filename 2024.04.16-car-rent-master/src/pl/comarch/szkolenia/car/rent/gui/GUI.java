package pl.comarch.szkolenia.car.rent.gui;

import pl.comarch.szkolenia.car.rent.model.Bus;
import pl.comarch.szkolenia.car.rent.model.Car;

import java.util.Scanner;

public class GUI {
    private static Scanner scanner = new Scanner(System.in);
    public static String showMenu() {
        System.out.println("1. List cars");
        System.out.println("2. Rent car");
        System.out.println("3. Return car");
        System.out.println("4. Exit");
        return scanner.nextLine();
    }

    public static void listCars(Car[] cars) {
        for(Car car : cars) {
            System.out.println(new StringBuilder()
                    .append(car.getBrand())
                    .append(" ")
                    .append(car.getModel())
                    .append(" ")
                    .append(car.getPlate())
                    .append(" ")
                    .append(car.getPrice())
                    .append(" ")
                    .append(car.isRent() ? "Niedostepny" : "Dostepny"));
        }
    }

    public static void listBuses(Bus[] buses) {
        for(Bus bus : buses) {
            System.out.println(new StringBuilder()
                    .append(bus.getBrand())
                    .append(" ")
                    .append(bus.getModel())
                    .append(" ")
                    .append(bus.getPlate())
                    .append(" ")
                    .append(bus.getPrice())
                    .append(" ")
                    .append(bus.getSeats())
                    .append(" ")
                    .append(bus.isRent() ? "Niedostepny" : "Dostepny"));
        }
    }

    public static String readPlate() {
        System.out.println("Type plate:");
        return scanner.nextLine();
    }

    public static void showSuccess(boolean result) {
        System.out.println(result ? "Success !!" : "Error !!");
    }
}
