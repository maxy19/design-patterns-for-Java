package com.mxy.design.mediator;

public class Mediator extends AbstractMediator {

    private TaobaoBuyer buyer;
    private TaobaoLogistics logistics;
    private TaobaosSller sller;

    public TaobaoBuyer getBuyer() {
        return buyer;
    }

    public void setBuyer(TaobaoBuyer buyer) {
        this.buyer = buyer;
    }

    public TaobaoLogistics getLogistics() {
        return logistics;
    }

    public void setLogistics(TaobaoLogistics logistics) {
        this.logistics = logistics;
    }

    public TaobaosSller getSller() {
        return sller;
    }

    public void setSller(TaobaosSller sller) {
        this.sller = sller;
    }

    private Double payMoney;
    private Double receiveMoney;
    private String goodsName;

    public Double getPayMoney() {
        return payMoney;
    }

    public void setPayMoney(Double payMoney) {
        this.payMoney = payMoney;
    }

    public Double getReceiveMoney() {
        return receiveMoney;
    }

    public void setReceiveMoney(Double receiveMoney) {
        this.receiveMoney = receiveMoney;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }
    @Override
    public void sendMessage(Class clazz) {
        try {
            Object currentObj = Class.forName(clazz.getName()).newInstance();
            if (currentObj instanceof TaobaoLogistics) {
                ((TaobaoLogistics) currentObj).receiveGoodsAndMoney(goodsName, receiveMoney);
            } else if (currentObj instanceof TaobaosSller) {
                sller.receiveMoney(receiveMoney);
                sller.sendGoodsToLogistics(goodsName);
                sller.payMoneyToLogistics(payMoney);
            } else if (currentObj instanceof TaobaoBuyer) {
                ((TaobaoBuyer) currentObj).payMoneyAndGoods(payMoney,goodsName);
            }
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
