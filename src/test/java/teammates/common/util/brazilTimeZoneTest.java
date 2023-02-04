package teammates.common.util;

import org.junit.Test;

import java.util.TimeZone;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class brazilTimeZoneTest {
    @Test
    public void testTimeZone() {
        TimeZone timeZone = TimeZone.getTimeZone("America/Sao_Paulo");
        assertNotNull(timeZone);
        assertEquals("America/Sao_Paulo", timeZone.getID());
        assertEquals(-10800000, timeZone.getRawOffset());
    }
}
