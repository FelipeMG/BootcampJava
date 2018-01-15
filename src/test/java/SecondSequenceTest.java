import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

public class SecondSequenceTest {

    @Test
    public void whenNumberIs1valueIs1(){
        assertThat(ArithmeticOperations.firstSequence(1) , is(1.0) );
    }

    @Test
    public void whenNumberIs2valueIs2_5(){
        assertThat(ArithmeticOperations.secondSequence(2) , is(2.5) );
    }

    @Test
    public void whenNumberIs3valueIs3_75(){
        assertThat(ArithmeticOperations.secondSequence(3) , is(3.75) );
    }

    @Test
    public void whenNumberIs4valueIs4_625(){
        assertThat(ArithmeticOperations.secondSequence(4) , is(4.625) );
    }

    @Test
    public void whenNumberIs5valueIs5_1875(){
        assertThat(ArithmeticOperations.secondSequence(5) , is(5.1875) );
    }

    @Test
    public void whenNumberIs6valueIs5_53125(){
        assertThat(ArithmeticOperations.secondSequence(6) , is(5.53125) );
    }
}
