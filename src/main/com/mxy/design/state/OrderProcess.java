package com.mxy.design.state;

public class OrderProcess {

    public static final OrderState CREATE = new CreateOrder();
    public static final OrderState PLACEORDER = new PlaceOrder();
    public static final OrderState PAYMENt = new PaymentOrder();
    public static final OrderState FINISH = new FinishOrder();

    private OrderState state;

    public OrderProcess(OrderState state) {
        this.state = state;
    }

    public OrderState getState() {
        return state;
    }

    public void setState(OrderState state) {
        this.state = state;
    }

    public void changeState() {
        state.changeState();
    }

}
