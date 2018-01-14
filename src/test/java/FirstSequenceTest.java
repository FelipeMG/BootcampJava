import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

public class FirstSequenceTest {

    @Test
    public void whenNumberIs1valueIs1(){
        assertThat(ArithmeticOperations.firstSequence(1) , is(1.0) );
    }

    @Test
    public void whenNumberIs2valueIs1_5(){
        assertThat(ArithmeticOperations.firstSequence(2) , is(1.5) );
    }

    @Test
    public void whenNumberIs3valueIs1_833(){
        assertThat(Math.floor( ArithmeticOperations.firstSequence(3) * 1000) / 1000 , is(1.833) );
    }

    @Test
    public void whenNumberIs4valueIs1_833(){
        assertThat(Math.floor( ArithmeticOperations.firstSequence(4) * 1000) / 1000 , is(2.083) );
    }

}
