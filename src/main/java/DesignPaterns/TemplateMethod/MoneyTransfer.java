package DesignPaterns.TemplateMethod;

import DesignPaterns.Strategy.DiscountStrategy;

import java.util.Observable;

/**
 * Created by Grzesiek on 2018-07-29
 */
public abstract class MoneyTransfer extends Observable {

    protected abstract boolean prepareTransfer();
    protected abstract int addCommission();



    public boolean performTransfer(int amount, DiscountStrategy discountStrategy) {
        addObserver(new HackertransferObserver());
        addObserver(new KNFtransferObserver());
        prepareTransfer();
        sendMoney(amount + addCommission() + addDiscount(discountStrategy));
        System.out.println();
        MoneyTransferHappend("Wykonano przelew na kwotę "+amount);
        return true;
    }

    private final void sendMoney(int amount) {
        System.out.println("Transfering money " + amount);
    }

    private int addDiscount(DiscountStrategy discountStrategy) {
        return discountStrategy.addDiscount();
    }

    public void MoneyTransferHappend(String arg) {
        setChanged();
        notifyObservers(arg);
    }


}
