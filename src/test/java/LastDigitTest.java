import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

public class LastDigitTest {

    @Test
    public void lastDigitOf1Is1(){
        assertThat(ArithmeticOperations.lastDigit(1) , is(1) );
    }

    @Test
    public void lastDigitOf10Is0(){
        assertThat(ArithmeticOperations.lastDigit(10) , is(0) );
    }

    @Test
    public void lastDigitOf12Is2(){
        assertThat(ArithmeticOperations.lastDigit(12) , is(2) );
    }

    @Test
    public void lastDigitOf120Is0(){
        assertThat(ArithmeticOperations.lastDigit(120) , is(0) );
    }

    @Test
    public void lastDigitOf125Is5(){
        assertThat(ArithmeticOperations.lastDigit(125) , is(5) );
    }
}
