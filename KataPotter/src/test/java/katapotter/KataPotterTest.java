package katapotter;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
import org.junit.Before;

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

    @Test
    public void return_book_price_when_one_book(){
        int[] books = new int[]{0,0,1,0,0};
        double price = kataPotter.calculePrice(books);
        assertThat(price,is(8.0));
        books = new int[]{0,1,0,0,0};
        price = kataPotter.calculePrice(books);
        assertThat(price,is(8.0));
        books = new int[]{0,0,1,0,0};
        price = kataPotter.calculePrice(books);
        assertThat(price,is(8.0));
        books = new int[]{0,0,0,1,0};
        price = kataPotter.calculePrice(books);
        assertThat(price,is(8.0));
        books = new int[]{0,0,0,0,1};
        price = kataPotter.calculePrice(books);
        assertThat(price,is(8.0));
        books = new int[]{0,0,0,1,0};
        price = kataPotter.calculePrice(books);
        assertThat(price,is(8.0));
    }

    @Test
    public void return_price_with_simple_discounts(){
        int[] books = new int[]{1,1,0,0,0};
        double price = kataPotter.calculePrice(books);
        assertThat(price,is(15.2));

        books = new int[]{1,0,1,0,1};
        price = kataPotter.calculePrice(books);
        assertThat(price,is(21.6));

        books = new int[]{1,1,1,0,1};
        price = kataPotter.calculePrice(books);
        assertThat(price,is(25.6));

        books = new int[]{1,1,1,1,1};
        price = kataPotter.calculePrice(books);
        assertThat(price,is(30.0));
    }

    @Test
    public void return_price_with_optimiced_discounts(){
        int[] books = new int[]{2,2,2,1,1};
        double price = kataPotter.calculePrice(books);
        assertThat(price,is(51.2));

        books = new int[]{5,5,4,5,4};
        price = kataPotter.calculePrice(books);
        assertThat(price,is(141.2));
    }
}
