package DesignPaterns.TemplateMethod;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Grzesiek on 2018-07-29
 */
public class HackertransferObserver implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Haker dziekuje za info o przelewie, zaraz przechwycę Twoją kasę :-)");
    }
}
