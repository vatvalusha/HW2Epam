package HW2.PC;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by vatva on 15.02.2017.
 */
public class WinchesterTest {
    @Test
    public void getMemory() throws Exception {
    Winchester winchester = new Winchester(1024);
    assertEquals(1024,winchester.getMemory());
    }

}