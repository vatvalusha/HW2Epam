package HW2.task10;

/**
 * Created by vatva on 20.02.2017.
 */
public class Part {
    private boolean status;

    public boolean isStatus() {
        return status;
    }

    public void switchStatusPC(){
        status = !status;
    }

    public void getPowerStatus(){
        System.out.println("status is :" + (isStatus()? "on":"off"));
    }

}
