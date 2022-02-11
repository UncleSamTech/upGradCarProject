package Interfaces;

import Model.CarBrakeModel;

public interface CarUpgradInterface {

    public int implementBrake(CarBrakeModel brakeModel);
    public int implementHorn();
    public int implementReverse();
    public int implementThrottle();
    public boolean UsesFuel();
}
