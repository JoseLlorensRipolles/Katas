package katarange;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by josellorens on 1/07/16.
 */
public class KataRangeTest {
    KataRange kataRange;

    @Before
    public void setUp(){kataRange = new KataRange(); }

    @Test
    public void return_true_when_containing_false_when_no(){
        assertEquals(kataRange.contain("[2,6)","{2,4}"),true);
        assertEquals(kataRange.contain("[2,6)","{-1}"),true);
        assertEquals(kataRange.contain("[2,6)","{2,4}"),true);
        assertEquals(kataRange.contain("[2,6)","{2,4}"),true);
        assertEquals(kataRange.contain("[2,6)","{2,4}"),true);

    }
}
