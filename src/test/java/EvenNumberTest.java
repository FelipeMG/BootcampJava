import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

public class EvenNumberTest {

    @Test
    public void number0IsEven(){
        assertThat(ArithmeticOperations.isEven (0),is(true));
    }

    @Test
    public void number4IsEven(){
        assertThat(ArithmeticOperations.isEven (4),is(true));
    }

    @Test
    public void numberMinus4IsEven(){
        assertThat(ArithmeticOperations.isEven (-4),is(true));
    }

    @Test
    public void number5IsNotEven(){
        assertThat(ArithmeticOperations.isEven (5),is(false));
    }
}
