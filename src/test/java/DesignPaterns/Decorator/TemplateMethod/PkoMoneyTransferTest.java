package DesignPaterns.Decorator.TemplateMethod;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Grzesiek on 2018-07-29
 */
public class PkoMoneyTransferTest {

    PkoMoneyTransfer pko = new PkoMoneyTransfer();

    @Test
    public void pkoMoneyTransfer_should_return_True(){
        assertEquals(true, pko.performTransfer(100));
    }

}