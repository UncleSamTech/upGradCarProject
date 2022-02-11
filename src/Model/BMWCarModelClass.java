package Model;

public class BMWCarModelClass extends CarSuperClass{

    public String Series;
    public String BodyColor;
    public BMWWheels WheelType;
    public double Cost;
    public double Power;
    public int DrivingPerformance;
    public double EnergyConsumption;

    public String getSeries() {
        return Series;
    }

    public void setSeries(String series) {
        Series = series;
    }

    public String getBodyColor() {
        return BodyColor;
    }

    public void setBodyColor(String bodyColor) {
        BodyColor = bodyColor;
    }

    public BMWWheels getWheelType() {
        return WheelType;
    }

    public void setWheelType(BMWWheels wheelType) {
        WheelType = wheelType;
    }

    public double getCost() {
        return Cost;
    }

    public void setCost(double cost) {
        Cost = cost;
    }

    public double getPower() {
        return Power;
    }

    public void setPower(double power) {
        Power = power;
    }

    public int getDrivingPerformance() {
        return DrivingPerformance;
    }

    public void setDrivingPerformance(int drivingPerformance) {
        DrivingPerformance = drivingPerformance;
    }

    public double getEnergyConsumption() {
        return EnergyConsumption;
    }

    public void setEnergyConsumption(double energyConsumption) {
        EnergyConsumption = energyConsumption;
    }

    public class BMWWheels{
        public int wheelInch;
        public String wheelColorType;
        public String buffType;

        public int getWheelInch() {
            return wheelInch;
        }

        public void setWheelInch(int wheelInch) {
            this.wheelInch = wheelInch;
        }

        public String getWheelColorType() {
            return wheelColorType;
        }

        public void setWheelColorType(String wheelColorType) {
            this.wheelColorType = wheelColorType;
        }

        public String getBuffType() {
            return buffType;
        }

        public void setBuffType(String buffType) {
            this.buffType = buffType;
        }
    }


}
