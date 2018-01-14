import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

public class MaxTest {

    @Test
    public void maxOf0And2Is2(){
        assertThat(ArithmeticOperations.max(0,2) , is(2) );
    }

    @Test
    public void maxOfMinus2And2Is2(){
        assertThat(ArithmeticOperations.max(-2,2) , is(2) );
    }

    @Test
    public void maxOfMinus2And0And2Is2(){
        assertThat(ArithmeticOperations.max(-2,0,2) , is(2) );
    }

    @Test
    public void maxOfMinus7And13And5Is13(){
        assertThat(ArithmeticOperations.max(-7,13,5) , is(13) );
    }

    @Test
    public void maxOf7And7And7Is7(){
        assertThat(ArithmeticOperations.max(7,7,7) , is(7) );
    }

    @Test
    public void maxOf7And3And5Is7(){
        assertThat(ArithmeticOperations.max(7,3,5) , is(7) );
    }
}
