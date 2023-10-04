package lesson.task3.solid.classes;

import lesson.task3.solid.enumerators.TypeCar;
import lesson.task3.solid.enumerators.TypeFuel;
import lesson.task3.solid.enumerators.TypeGearBox;
import lesson.task3.solid.interfaces.ICarWash;
import lesson.task3.solid.interfaces.IFuelStation;

import java.awt.*;

public class Pickup extends Car implements IFuelStation, ICarWash{
    private int loadCap;
    public Pickup(String make, String model, int numberWheels, TypeFuel fuelType,
                  TypeGearBox gearBoxType, Color bodyColor,
                  int engineCap, int loadCap) {
        super(make, model, TypeCar.PICKUP, numberWheels, fuelType,
                gearBoxType, bodyColor, engineCap);

        this.loadCap=loadCap;
    }

    @Override
    public void wipWindowsShield() {
        
    }

    @Override
    public void wipMHeadLights() {

    }

    @Override
    public void wipMirrors() {

    }
}
