package com.mxy.design.mediator;

import org.junit.Test;

/**
 * 中介者模式:用一个中介对象来封装一系列的对象交互。中介者使各对象不需要显式地相互引用，从而使其耦合松散，而且可以独立地改变它们之间的交互
 *
 * 优点：
 * 同事对象之间的交互都被封装到中介者对象里面集中管理，集中了控制交互。当交互发生改变时，修改中介者对象。扩展中介者对象时，其他对象不需要做修改。
 * 缺点：
 * 过度集中化，这是中介者模式潜在的缺点。如果对象多了，交互复杂。全部集中到中介者对象中，会导致中介者对象十分臃肿，难以管理和维护
 *
 * 角色说明：
 * 抽象中介者角色（AbstractMediator）：定义出同事对象到中介者对象的接口，其中主要方法是一个（或多个）事件方法。
 *
 * 具体中介者角色（ConcreteMediator）：实现抽象中介者中所声明的事件方法。具体中介者直销所有的具体同事类，并负责具体的协调各个同事对象的交互关系。
 *
 * 抽象同事类角色（AbstractColleague）：定义出红接着到同事对象的接口。同事对象只知道中介者，而不知道的同事对象。(核心)
 *
 * 具体同事类角色（ConcreteColleague）：所有的具体同事类均从抽象同事类继承而来。实现自己的业务，在需要与其他同事通信的时候，就与持有的中介者通信，中介者会负责与其他的同时交互。

 */

public class MediatorTest {

    @Test
    public void logicTest() {
        Mediator mediator = new Mediator();
        TaobaosSller sller = new TaobaosSller(mediator);
        TaobaoLogistics logistics = new TaobaoLogistics(mediator);
        TaobaoBuyer buyer = new TaobaoBuyer(mediator);

        mediator.setBuyer(buyer);
        mediator.setLogistics(logistics);
        mediator.setSller(sller);

        //同事之间不知道对方,至于中介沟通
        buyer.contact();
             System.out.println();
        sller.contact();
            System.out.println();
        logistics.contact();



    }


}
