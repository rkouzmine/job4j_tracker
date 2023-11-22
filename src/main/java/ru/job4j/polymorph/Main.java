package ru.job4j.polymorph;

public class Main {
    public static void main(String[] args) {
        Vehicle townCar = new TownCar();
        townCar.accelerate();
        townCar.brake();
        townCar.steer();
        townCar.changeGear();
        townCar.refill();
        System.out.println();
        SportCar sportCar = new SportCar();
        Vehicle vehicle = sportCar;
        Fuel fuel = sportCar;
        vehicle.brake();
        vehicle.steer();
        vehicle.changeGear();
        fuel.refill();
        System.out.println();
        sportCar.accelerate();
        sportCar.changeGear();
        sportCar.brake();
        sportCar.refill();

    }
}
