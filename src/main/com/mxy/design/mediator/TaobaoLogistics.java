package com.mxy.design.mediator;

public class TaobaoLogistics implements ITaobaosMarket {


    public TaobaoLogistics() {
    }

    private Mediator mediator;

    public TaobaoLogistics(Mediator mediator) {
        this.mediator = mediator;
    }

    public void receiveGoodsAndMoney(String goodsName, Double number) {
        System.out.println("快递小哥收到"+number+"与商品"+goodsName+"开始送货");
    }

    @Override
    public void contact() {
        mediator.setReceiveMoney(10D);
        mediator.setGoodsName("篮球");
        mediator.sendMessage(TaobaoLogistics.class);
    }
}
