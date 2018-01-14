import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

public class IsMultipleTest {

    @Test(expected = IllegalArgumentException.class)
    public void number4IsNotMultipleOf0(){
        assertThat(ArithmeticOperations.isMultiple(4,0), is(true) );
    }

    @Test
    public void number4IsMultipleOf2(){
        assertThat(ArithmeticOperations.isMultiple(4,2), is(true) );
    }

    @Test
    public void number7IsNotMultipleOf2(){
        assertThat(ArithmeticOperations.isMultiple(7,2), is(false) );
    }

    @Test
    public void numberMinus9IsMultipleOf3(){
        assertThat(ArithmeticOperations.isMultiple(-9,3), is(true) );
    }

    @Test
    public void number9IsMultipleOfMinus3(){
        assertThat(ArithmeticOperations.isMultiple(9,-3), is(true) );
    }

    @Test
    public void numberMinus9IsMultipleOfMinus3(){
        assertThat(ArithmeticOperations.isMultiple(-9,-3), is(true) );
    }

}
