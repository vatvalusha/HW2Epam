package HW2.task10;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by vatva on 20.02.2017.
 */
public class PCTest {

    Computer pc = new Computer("Pentium 4",3.4,3,1024);


    @Test
    public void switchStatusFalse() throws Exception {
        assertFalse(true == pc.isStatus());
    }

    @Test
    public void switchStatusTrue() throws Exception {
        pc.switchStatusPC();
        assertTrue(true == pc.isStatus());
    }

    @Test
    public void memoryPC() throws Exception {
        assertEquals(1024,pc.getWinchester().getMemory());
    }

    @Test
    public void setSpeed() throws Exception {
        Computer.CPU cpu = new Computer.CPU(1.7);
        assertEquals(1.7,cpu.getSpeed(),0.1);
    }

    @Test
    public void getMemory() throws Exception {
        Computer.Winchester winchester = new Computer.Winchester(1024);
        assertEquals(1024,winchester.getMemory());
    }


}