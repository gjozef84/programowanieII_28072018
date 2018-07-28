import java.util.Observable;

/**
 * Created by Grzesiek on 2018-07-28
 */
public class Dispatcher extends Observable {

    public void accidentHappend(String arg) {
        setChanged();
        notifyObservers(arg);
    }

    public static void main(String[] args) {

        Dispatcher dispatcher = new Dispatcher();
        Ambulance ambulance = new Ambulance();
        Journalist journalist = new Journalist();
        CIAagent ciAagent = new CIAagent();

        dispatcher.addObserver(ambulance);
        dispatcher.addObserver(journalist);
        dispatcher.addObserver(ciAagent);
        dispatcher.accidentHappend("na ulicy Marszałkowskiej");
        dispatcher.deleteObserver(journalist);
        dispatcher.accidentHappend("na ulicy Długiej, info nie dostaną dziennikarze :-)");
    }
}
