package com.mxy.design.factory.static_;

public class CartFactory {

    public static Cart createCart(String cartName) throws Exception {
        Cart cart = null;
        if (cartName.equals("BYD")) {
           return new BYD();
        } else if (cartName.equals("BMW")) {
            return new BMW();
        }
        throw new Exception("没有"+cartName+"这样的车类型");

    }


    public static <T> T createCart(Class<? extends Cart> clazz) {
        T obj = null;
        try {
            obj = (T) (Class.forName(clazz.getName()).newInstance());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return obj;
    }
}
