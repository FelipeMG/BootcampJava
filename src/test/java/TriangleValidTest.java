import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

public class TriangleValidTest {

    @Test
    public void sides3And4And5AreValid(){
        Length[] lengths = {Length.of(3),Length.of(4),Length.of(5)};
        assertThat(TriangleOperations.sideValidation(lengths) ,is(true));
    }

    @Test
    public void sides3And4And7AreNotValid(){
        Length[] lengths = {Length.of(3),Length.of(4),Length.of(7)};
        assertThat(TriangleOperations.sideValidation(lengths) ,is(false));
    }

    @Test
    public void sides6And2And4AreNotValid(){
        Length[] lengths = {Length.of(6),Length.of(2),Length.of(4)};
        assertThat(TriangleOperations.sideValidation(lengths) ,is(false));
    }
}
