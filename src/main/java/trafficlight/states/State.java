package trafficlight.states;

//TODO implement a part of the pattern here

import trafficlight.gui.TrafficLight;

public abstract class State extends Subject{ //concrete subject

    public abstract State getNextState();

    public abstract String getColor();

    public String getSting(){
        return getColor();
    }

    @Override
    public void addObserver(TrafficLight o) {
        super.addObserver(o);
    }

    @Override
    public void removeObserver(TrafficLight o) {
        super.removeObserver(o);
    }

    @Override
    public void notifyObservers() {
        super.notifyObservers();
    }
}