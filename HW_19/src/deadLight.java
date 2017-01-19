/**
 * Created by Дмитрий on 19.01.2017.
 */
abstract class deadLight implements SourceOfLight {
    boolean isOn;
    String sourceName;
    String action;
    int bright;

    public deadLight(boolean isOn, String sourceName, String action, int bright) {
        this.isOn = isOn;
        this.sourceName = sourceName;
        this.action = action;
        this.bright = bright;
    }

    @Override
    public void turnOn() {
        this.isOn=false;
        this.bright=0;
        System.out.println("Свеt выключен");
    }
    //////dcddscsd
    @Override
    public void show() {
        this.isOn=true;
        this.bright=100;
        System.out.println("Свеt включен");

    }

    @Override
    public void getBright(int source) {
        if (bright>1 && bright <100){
            if (isOn) {
                this.bright = bright;
                System.out.println("Свет горит с яркостью " + bright+ " ватт");
            }
            else System.out.println("Свет выключен");
        }
        else System.out.println("Яркость необходимо укаывать от 0 до 100");

    }
}
