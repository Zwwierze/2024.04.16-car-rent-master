package pl.comarch.szkolenia.car.rent.model;

public class Bus {
    private String brand;
    private String model;
    private boolean rent;
    private String plate;
    private double price;
    int seats;

    public Bus(String brand, String model, String plate, double price, int seats) {
        this.brand = brand;
        this.model = model;
        this.rent = false;
        this.plate = plate;
        this.price = price;
        this.seats = seats;
    }

    public Bus() {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean isRent() {
        return rent;
    }

    public void setRent(boolean rent) {
        this.rent = rent;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }
}
