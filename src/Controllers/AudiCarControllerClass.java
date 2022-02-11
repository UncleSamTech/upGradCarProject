package Controllers;

import Interfaces.CarUpgradInterface;
import Model.CarBrakeModel;

public class AudiCarControllerClass implements CarUpgradInterface {

    @Override
    public int implementBrake(CarBrakeModel brakeModel) {
        return 0;
    }

    @Override
    public int implementHorn() {
        return 0;
    }

    @Override
    public int implementReverse() {
        return 0;
    }

    @Override
    public int implementThrottle() {
        return 0;
    }

    @Override
    public boolean UsesFuel() {
        return false;
    }
}
