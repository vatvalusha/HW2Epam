package HW2.PC;

/**
 * Created by vatva on 13.02.2017.
 */
public class Winchester extends Part{
    private int memory;

    public Winchester(int memory){
        this.memory = memory;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    @Override
    public String toString() {
        return "Winchester{" +
                "memory=" + memory +
                '}';
    }
}
