import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

public class LeapYearTest {

    @Test(expected = IllegalArgumentException.class)
    public void year0IsNotAValidYear(){
        assertThat(YearOperations.isLeapYear(0) ,is(false));
    }

    @Test
    public void year2016IsALeapYear(){
        assertThat(YearOperations.isLeapYear(2016) ,is(true));
    }

    @Test
    public void year1900IsNotALeapYear(){
        assertThat(YearOperations.isLeapYear(1900) ,is(false));
    }

    @Test
    public void year2000IsALeapYear(){
        assertThat(YearOperations.isLeapYear(2000) ,is(true));
    }

    @Test
    public void year2400IsALeapYear(){
        assertThat(YearOperations.isLeapYear(2400) ,is(true));
    }

    @Test
    public void year1800IsNotALeapYear(){
        assertThat(YearOperations.isLeapYear(1800) ,is(false));
    }

    @Test
    public void year2100IsNotALeapYear(){
        assertThat(YearOperations.isLeapYear(2100) ,is(false));
    }

    @Test
    public void year2200IsNotALeapYear(){
        assertThat(YearOperations.isLeapYear(2200) ,is(false));
    }

    @Test
    public void year2300IsNotALeapYear(){
        assertThat(YearOperations.isLeapYear(2300) ,is(false));
    }

    @Test
    public void year2500IsNotALeapYear(){
        assertThat(YearOperations.isLeapYear(2500) ,is(false));
    }
}
