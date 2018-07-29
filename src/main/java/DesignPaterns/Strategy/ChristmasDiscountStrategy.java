package DesignPaterns.Strategy;

import DesignPaterns.Strategy.DiscountStrategy;

/**
 * Created by Grzesiek on 2018-07-29
 */
public class ChristmasDiscountStrategy implements DiscountStrategy {

    @Override
    public int addDiscount() {
        System.out.println("add Christmas Discount -5zł");
        return -5;
    }
}
