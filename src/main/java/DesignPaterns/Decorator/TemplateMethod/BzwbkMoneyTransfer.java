package DesignPaterns.Decorator.TemplateMethod;

/**
 * Created by Grzesiek on 2018-07-29
 */
public class BzwbkMoneyTransfer extends MoneyTransfer {

    String bankName = "PKO BP";
    int commision = 35;

    @Override
    protected boolean prepareTransfer() {
        System.out.println("Starting transfer from bank BZWBK");
        return true;
    }

    @Override
    protected boolean addCommission() {
        System.out.println("Add commision " + commision);
        return true;
    }
}
