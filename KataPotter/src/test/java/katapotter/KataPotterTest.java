package katapotter;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.experimental.theories.suppliers.TestedOn;


/**
 * Created by josellorens on 1/07/16.
 */
public class KataPotterTest {
    KataPotter kataPotter;

    @Before
    public void setUp(){kataPotter= new KataPotter(); }

    @Test
    public void return_zero_when_no_books(){
        int[] books = new int[]{};
        double price = kataPotter.calculePrice(books);
        assertThat(price,is(0.0));
    }
}
