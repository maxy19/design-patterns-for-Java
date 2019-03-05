package com.mxy.design.factory.abstract_;

/**
 * 具体工厂
 */
public class BikeFactory extends Factory {

    @Override
    protected <T> T getBike(Class<T> clazz) {
        try {
            return (T) Class.forName(clazz.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
