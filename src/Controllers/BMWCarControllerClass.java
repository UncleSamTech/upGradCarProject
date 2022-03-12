package Controllers;

import Interfaces.CarUpgradInterface;
import Model.BMWCarModelClass;
import Model.CarBrakeModel;

public class BMWCarControllerClass implements CarUpgradInterface {
    int speed = 0;
    BMWCarModelClass BmwModel;
    public BMWCarControllerClass() {
        BmwModel = new BMWCarModelClass();

    }

    @Override
    public int implementBrake(CarBrakeModel brakeModel) {
        if(brakeModel.getContinousPowerDissipation() > 5 && brakeModel.getPower() > 10 && brakeModel.getWeight() > 20){
            speed = (int) ((brakeModel.getContinousPowerDissipation() - 10) / ((brakeModel.getPower()) / 5) - (brakeModel.getWeight() / 5));
        }

        return speed < 1 ? 0 : 1;
    }

    @Override
    public int implementHorn() {
    	
        return BmwModel.getSound()>0?1 : 0;
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
        if(BmwModel.getPower() > 30)
            return true;
        return false;
    }
}
