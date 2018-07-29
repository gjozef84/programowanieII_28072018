package DesignPaterns.Decorator;


import lombok.AllArgsConstructor;

/**
 * Created by Grzesiek on 2018-07-29
 */

public class Prefix extends WordDecorator {

    public Prefix(Word word) {
        super(word);
    }

    @Override
    public String display() {
        return "PREFIX "+ word.display();
    }
}
