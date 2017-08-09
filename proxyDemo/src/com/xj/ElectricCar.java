package com.xj;

/**
 * Created by xiongjun on 2017/8/9.
 */
public class ElectricCar implements Vehicle,Rechargable {
    @Override
    public void recharge() {
        System.out.println("ElectricCar is recharge............");
    }

    @Override
    public void drive() {
        System.out.println("ElectricCar is moving............");
    }
}
