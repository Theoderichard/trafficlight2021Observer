package trafficlight.states;

import trafficlight.gui.Observer;
import trafficlight.gui.TrafficLight;

import java.util.ArrayList;

public class Subject {

    ArrayList<TrafficLight> observers = new ArrayList();//speichert die concrete observer (TreafficLight)

    public void addObserver(TrafficLight o){//fügt der ArrayList einen concrete Observer hinzu
        observers.add(o);
    }

    public void removeObserver(TrafficLight o){//entfernt einen concrete Observer aus der ArrayList
        int index = observers.indexOf(o);
        observers.remove(index);
    }

    public void notifyObservers(){ //updated alle observer aus der ArrayList
        for (TrafficLight e: observers) {
            e.update();
        }
    }
}
