import trafficlight.ctrl.TrafficLightCtrl;


public class MCP {
    public static void main(String[] args) {
        //TrafficLightCtrl ctrl = new TrafficLightCtrl();
        TrafficLightCtrl.getInstance().run(); //instanzierung als Singleton
        //ctrl.run();
    }
}