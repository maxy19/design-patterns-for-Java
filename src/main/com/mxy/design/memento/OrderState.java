package com.mxy.design.memento;

import java.util.Stack;

/**
 * 订单状态
 */
public class OrderState {

    /**
     * 利用LIFO 后进先出
     */
    private Stack<String> stateList = new Stack<>();

    public Stack<String> getStateList() {
        return stateList;
    }

    public void setStateList(Stack<String> stateList) {
        this.stateList = stateList;
    }

    /**
     * 存储当前添加的状态
     * @param memento
     */
    public void restoreMemento(Memento memento){
         this.stateList.add(memento.getState());
    }

}
