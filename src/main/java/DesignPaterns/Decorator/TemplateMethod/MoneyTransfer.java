package DesignPaterns.Decorator.TemplateMethod;

/**
 * Created by Grzesiek on 2018-07-29
 */
public abstract class MoneyTransfer {

    public boolean performTransfer(int amount) {
        if (prepareTransfer() && addCommission()) {
            sendMoney(amount);
            return true;
        } else return false;

    }

    protected final void sendMoney(int amount) {
        System.out.println("Transfering " + amount + " money...");
    }

    protected abstract boolean prepareTransfer();

    protected abstract boolean addCommission();
}
