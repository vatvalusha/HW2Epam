package HW2.PC;

/**
 * Created by vatva on 13.02.2017.
 */
public class Part  {

    private boolean status;

    public boolean isStatus() {
        return status;
    }

    public void switchStatus(){
        status = !status;
    }

    public void getPowerStatus(){
        System.out.println("status is :" + (isStatus()? "on":"off"));
    }
}
