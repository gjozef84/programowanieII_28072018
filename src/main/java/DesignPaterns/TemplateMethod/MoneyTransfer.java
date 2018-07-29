package DesignPaterns.TemplateMethod;

import DesignPaterns.Strategy.DiscountStrategy;

/**
 * Created by Grzesiek on 2018-07-29
 */
public abstract class MoneyTransfer {

    protected abstract boolean prepareTransfer();

    protected abstract int addCommission();

    public boolean performTransfer(int amount, DiscountStrategy discountStrategy) {
        prepareTransfer();
        //addCommission();
        sendMoney(amount + addCommission() + addDiscount(discountStrategy));
        return true;
    }

    private final void sendMoney(int amount) {
        System.out.println("Transfering money " + amount);
    }

    private int addDiscount(DiscountStrategy discountStrategy) {
        return discountStrategy.addDiscount();
    }


}
