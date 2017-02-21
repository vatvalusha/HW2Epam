package HW2.PC;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by vatva on 15.02.2017.
 */
public class CPUTest {
    @Test
    public void setSpeed() throws Exception {
    CPU cpu = new CPU(1.7);
    assertEquals(1.7,cpu.getSpeed(),0.1);
    }

}