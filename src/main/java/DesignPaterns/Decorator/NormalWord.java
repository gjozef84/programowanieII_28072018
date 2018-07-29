package DesignPaterns.Decorator;

/**
 * Created by Grzesiek on 2018-07-29
 */
public class NormalWord implements Word {

    @Override
    public String display() {
        return "Zwykłe słowo";
    }
}
