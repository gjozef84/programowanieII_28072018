import java.util.Observable;
import java.util.Observer;

/**
 * Created by Grzesiek on 2018-07-28
 */
public class Ambulance implements Observer {

    @Override
    public void update(Observable o, Object arg) {

        System.out.println("Ambulance wydarzył się wypadek " + arg);
    }
}
