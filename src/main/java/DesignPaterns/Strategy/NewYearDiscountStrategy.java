package DesignPaterns.Strategy;

/**
 * Created by Grzesiek on 2018-07-29
 */
public class NewYearDiscountStrategy implements DiscountStrategy {

    @Override
    public int addDiscount() {
        System.out.println("add New Year Discount -10zł");
        return -10;
    }
}
