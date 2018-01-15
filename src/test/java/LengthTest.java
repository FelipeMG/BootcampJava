import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;


public class LengthTest {

    @Test
    public void lengthOf3Is3(){
        assertThat(Length.of(3).getMeasure(), is(3.0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void lengthOfMinus3IsNotValid(){
        assertThat(Length.of(-3).getMeasure(), is(-3.0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void lengthOf0IsNotValid(){
        assertThat(Length.of(0).getMeasure(), is(0.0));
    }

}