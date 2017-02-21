package HW2.PC;

/**
 * Created by vatva on 13.02.2017.
 */
public class RAM extends Part{
    private int volume;

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public RAM(int volume){
        this.volume = volume;
    }
}
