package HW2.PC;

/**
 * Created by vatva on 13.02.2017.
 */
public class CPU extends Part {

    private double speed;

    public CPU(double speed){
        this.speed = speed;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }
}
