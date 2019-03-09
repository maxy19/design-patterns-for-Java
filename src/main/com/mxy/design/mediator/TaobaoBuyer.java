package com.mxy.design.mediator;

public class TaobaoBuyer implements ITaobaosMarket {


    public TaobaoBuyer() {
    }

    private Mediator mediator;

    public TaobaoBuyer(Mediator mediator) {
        this.mediator = mediator;
    }

    public void payMoneyAndGoods(Double number, String goodsName) {
        System.out.println("买家支付"+number+"与商品"+goodsName+"给卖家");
    }

    @Override
    public void contact() {
        mediator.setPayMoney(100D);
        mediator.setGoodsName("篮球");
        mediator.sendMessage(TaobaoBuyer.class);
    }
}
