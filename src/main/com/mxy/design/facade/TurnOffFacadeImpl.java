package com.mxy.design.facade;

public class TurnOffFacadeImpl implements TurnOffFacade {

    private TurnOffService turnOff = new TurnOffServiceImpl();

    @Override
    public void turnOffAll(){
        turnOff.turnOffDoor();
        turnOff.turnOffLight();
        turnOff.turnOffWindow();
    }

}
