package com.mxy.design.mediator;

public class TaobaosSller implements ITaobaosMarket{


    public TaobaosSller() {
    }

    private Mediator mediator;

    public TaobaosSller(Mediator mediator) {
        this.mediator = mediator;
    }

    public void receiveMoney(Double number) {
        System.out.println("卖家收到买家支付的"+number+"元钱");
    }

    public void payMoneyToLogistics(Double number) {
        System.out.println("卖家支付"+number+"给快递小哥");
    }

    public void sendGoodsToLogistics(String goodsName) {
        System.out.println("卖家把商品"+goodsName+"给快递小哥");
    }

    @Override
    public void contact() {
        mediator.setReceiveMoney(100D);
        mediator.setPayMoney(10D);
        mediator.setGoodsName("篮球");
        mediator.sendMessage(TaobaosSller.class);
    }
}
