package DesignPaterns.Decorator;

/**
 * Created by Grzesiek on 2018-07-29
 */
public class Sufix extends WordDecorator {

    public Sufix(Word word) {
        super(word);
    }

    @Override
    public String display() {
        return word.display()+" SUFIX";

    }
}
