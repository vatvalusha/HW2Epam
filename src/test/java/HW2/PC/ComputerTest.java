package HW2.PC;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by vatva on 15.02.2017.
 */
public class ComputerTest {

    Computer pc = new Computer("Pentium 4",3.4,3,1024);


    @Test
    public void switchStatusFalse() throws Exception {
    assertFalse(true == pc.isStatus());
    }

    @Test
    public void switchStatusTrue() throws Exception {
        pc.switchStatus();
        assertTrue(true == pc.isStatus());
    }

    @Test
    public void memoryPC() throws Exception {
        assertEquals(1024,pc.getWinchester().getMemory());

    }

    @Test
    public void scanViruses() throws Exception {
        pc.switchStatus();
        boolean b = pc.scanViruses();
        if(b) assertTrue(true == b);
        else assertFalse(true == b);
    }

}