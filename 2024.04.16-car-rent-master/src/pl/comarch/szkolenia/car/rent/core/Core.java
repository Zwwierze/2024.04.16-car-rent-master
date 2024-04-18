package pl.comarch.szkolenia.car.rent.core;

import pl.comarch.szkolenia.car.rent.db.VehicleRepository;
import pl.comarch.szkolenia.car.rent.gui.GUI;

public class Core {
    public void start() {
        final VehicleRepository carRepository = new VehicleRepository();
        boolean run = true;
        while (run) {
            switch(GUI.showMenu()) {
                case "1":
                    GUI.listCars(carRepository.getCars());
                    GUI.listBuses(carRepository.getBuses());
                    break;
                case "2":
                    GUI.showSuccess(
                            carRepository.rentVehicle(
                                    GUI.readPlate()));
                    break;
                case "3":
                    GUI.showSuccess(
                            carRepository.returnVehicle(
                                    GUI.readPlate()));
                    break;
                case "4":
                    run = false;
                    break;
                default:
                    System.out.println("Wrong choose");
                    break;
            }
        }
    }
}
