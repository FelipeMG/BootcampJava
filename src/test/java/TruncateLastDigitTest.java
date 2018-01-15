import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

public class TruncateLastDigitTest {

    @Test
    public void number1234TruncatedIs123(){
        assertThat(ArithmeticOperations.truncateLastDigit(1234), is(123) );
    }

    @Test
    public void number12TruncatedIs1(){
        assertThat(ArithmeticOperations.truncateLastDigit(12), is(1) );
    }

    @Test
    public void number1TruncatedIs1(){
        assertThat(ArithmeticOperations.truncateLastDigit(1), is(1) );
    }
}
