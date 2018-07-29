package DesignPaterns.TemplateMethod;

/**
 * Created by Grzesiek on 2018-07-29
 */
public class PkoMoneyTransfer extends MoneyTransfer {

    String bankName = "PKO BP";
    int commision = 20;

    @Override
    protected boolean prepareTransfer() {
        System.out.println("Starting transfer from bank " + bankName);
        return true;
    }

    @Override
    protected int addCommission() {
        System.out.println("Add commision " + commision);
        return commision;
    }
}
