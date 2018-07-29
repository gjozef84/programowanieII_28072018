package DesignPaterns.TemplateMethod;

import DesignPaterns.Strategy.DiscountStrategy;

/**
 * Created by Grzesiek on 2018-07-29
 */
public class ChristmasDiscountStrategy implements DiscountStrategy {

    @Override
    public int addDiscount() {
        return -5;
    }
}
