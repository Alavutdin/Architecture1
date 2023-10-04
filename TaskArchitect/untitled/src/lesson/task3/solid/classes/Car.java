package lesson.task3.solid.classes;

import lesson.task3.solid.enumerators.TypeCar;
import lesson.task3.solid.enumerators.TypeFuel;
import lesson.task3.solid.enumerators.TypeGearBox;
import lesson.task3.solid.interfaces.IFuelStation;

import java.awt.*;

public class Car implements IFuelStation {
    private String make;
    private String model;
    private TypeCar bodyCar;
    private int numberWheels;
    private TypeFuel fuelType;
    private TypeGearBox gearBoxType;
    private Color bodyColor;
    private int engineCap;

    public Car(String make, String model, TypeCar bodyCar, int numberWheels,
               TypeFuel fuelType, TypeGearBox gearBoxType,
               Color bodyColor, int engineCap) {
        this.make = make;
        this.model = model;
        this.bodyCar = bodyCar;
        this.numberWheels = numberWheels;
        this.fuelType = fuelType;
        this.gearBoxType = gearBoxType;
        this.bodyColor = bodyColor;
        this.engineCap = engineCap;
    }

    public void movement(){

    }
    public void mainTenance(){

    }
    public boolean turnLights(){
        return true;
    }
    public boolean turnWrappers(){
        return true;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public TypeCar getBodyCar() {
        return bodyCar;
    }

    public void setBodyCar(TypeCar bodyCar) {
        this.bodyCar = bodyCar;
    }

    public int getNumberWheels() {
        return numberWheels;
    }

    public void setNumberWheels(int numberWheels) {
        this.numberWheels = numberWheels;
    }

    public TypeFuel getFuelType() {
        return fuelType;
    }

    public void setFuelType(TypeFuel fuelType) {
        this.fuelType = fuelType;
    }

    public TypeGearBox getGearBoxType() {
        return gearBoxType;
    }

    public void setGearBoxType(TypeGearBox gearBoxType) {
        this.gearBoxType = gearBoxType;
    }

    public Color getBodyColor() {
        return bodyColor;
    }

    public void setBodyColor(Color bodyColor) {
        this.bodyColor = bodyColor;
    }

    public int getEngineCap() {
        return engineCap;
    }

    public void setEngineCap(int engineCap) {
        this.engineCap = engineCap;
    }

    @Override
    public void fuel() {

    }
}
