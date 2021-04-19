package trafficlight.gui;


import java.awt.*;

public class TrafficLight extends Light implements Observer{ // concrete Observer

    TrafficLight(Color color) {
        super(color);
    }

    public void turnOn(boolean a) {
        isOn = a;
        repaint();
    }

    public boolean isOn() {
        return isOn;
    }


    //TODO implement a part of the pattern here

    @Override
    public void update() { //dreht das Licht an wenn es momentan aus ist und umgekehrt
//        if (!this.isOn){ //meine ursprüngliche variante
//            this.turnOn(true);
//        }else{
//            this.turnOn(false);
//        }
        this.turnOn(!this.isOn); //auto-simplified mit IntelliJ
    }


}
