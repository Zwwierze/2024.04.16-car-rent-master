package pl.comarch.szkolenia.car.rent.db;

import pl.comarch.szkolenia.car.rent.model.Bus;
import pl.comarch.szkolenia.car.rent.model.Car;

public class VehicleRepository {
    private final Car[] cars = new Car[5];
    private final Bus[] buses = new Bus[2];

    public VehicleRepository() {
        this.cars[0] = new Car("Toyota",
                "Corolla",
                "KR11",
                300.00);
        this.cars[1] = new Car("Kia",
                "Ceed",
                "KR22",
                200.00);
        this.cars[2] = new Car("Fiat",
                "126p",
                "KR33",
                400.00);
        this.cars[3] = new Car("Mercedes",
                "C",
                "KR44",
                500.00);
        this.cars[4] = new Car("BMW",
                "3",
                "KR55",
                500.00);
        this.buses[0] = new Bus("Solaris",
                "1000",
                "KR66",
                1000.00,
                50);
        this.buses[1] = new Bus("Mercedes",
                "Suer",
                "KR77",
                1000.00,
                60);
    }

    public Car[] getCars() {
        return this.cars;
    }

    public Bus[] getBuses() {
        return this.buses;
    }

    public boolean rentVehicle(String plate) {
        Car car = findCar(plate);
        if(car != null && !car.isRent()) {
            car.setRent(true);
            return true;
        }
        Bus bus = findBus(plate);
        if(bus != null && !bus.isRent()) {
            bus.setRent(true);
            return true;
        }
        return false;
    }

    public boolean returnVehicle(String plate) {
        Car car = findCar(plate);
        if(car != null && car.isRent()) {
            car.setRent(false);
            return true;
        }
        Bus bus = findBus(plate);
        if(bus != null && bus.isRent()) {
            bus.setRent(false);
            return true;
        }
        return false;
    }

    private Car findCar(String plate) {
        for(Car car : this.cars) {
            if(car.getPlate().equals(plate)) {
                return car;
            }
        }
        return null;
    }

    private Bus findBus(String plate) {
        for(Bus bus : this.buses) {
            if(bus.getPlate().equals(plate)) {
                return bus;
            }
        }
        return null;
    }
}
