package DesignPaterns.TemplateMethod;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Grzesiek on 2018-07-29
 */
public class BzwbkMoneyTransferTest {

    BzwbkMoneyTransfer bzwbk = new BzwbkMoneyTransfer();

    @Test
    public void bzwbkTransfer_should_return_true(){
        assertEquals(true, bzwbk.performTransfer(50, new ChristmasDiscountStrategy()));
    }

}