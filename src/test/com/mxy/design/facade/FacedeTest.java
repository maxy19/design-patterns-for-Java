package com.mxy.design.facade;

import org.junit.Test;

/**
 * 门面模式：为子系统中的一组接口提供一个一致的界面，外观模式定义了一个高层接口，这个接口使得这一子系统更加容易使用.
 */
public class FacedeTest {


    @Test
    public void logicTest() {
        //使用前需要些很多方法来处理
        System.out.println("==使用前==");
        TurnOffService turnOffService = new TurnOffServiceImpl();
        turnOffService.turnOffWindow();
        turnOffService.turnOffDoor();
        turnOffService.turnOffLight();
        //使用后只需要一个方法来代替（简单说就是又封装一层）
        System.out.println("==使用后==");
        TurnOffFacade facade = new TurnOffFacadeImpl();
        facade.turnOffAll();
    }


}
