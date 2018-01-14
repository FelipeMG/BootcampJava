import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

public class IsOddTest {

    @Test
    public void number0IsNotOdd(){
        assertThat(ArithmeticOperations.isOdd(0),is(false));
    }

    @Test
    public void number4IsNotOdd(){
        assertThat(ArithmeticOperations.isOdd(4),is(false));
    }

    @Test
    public void number5IsOdd(){
        assertThat(ArithmeticOperations.isOdd(5),is(true));
    }

    @Test
    public void numberMinus5IsOdd(){
        assertThat(ArithmeticOperations.isOdd(-5),is(true));
    }

}
