package Model;

public class CarSuperClass {
    public String CarName;
    public String CarType;
    public String CarBrandName;
    public int CarTyreCount;
    public double CarCost;

    public String getCarName() {
        return CarName;
    }

    public void setCarName(String carName) {
        CarName = carName;
    }

    public String getCarType() {
        return CarType;
    }

    public void setCarType(String carType) {
        CarType = carType;
    }

    public String getCarBrandName() {
        return CarBrandName;
    }

    public void setCarBrandName(String carBrandName) {
        CarBrandName = carBrandName;
    }

    public int getCarTyreCount() {
        return CarTyreCount;
    }

    public void setCarTyreCount(int carTyreCount) {
        CarTyreCount = carTyreCount;
    }

    public double getCarCost() {
        return CarCost;
    }

    public void setCarCost(double carCost) {
        CarCost = carCost;
    }
}
