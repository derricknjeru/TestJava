package test;

import main.StringCalculator;
import org.junit.Assert;
import org.junit.Test;


/**
 * @Link https://jenkins.io/doc/tutorials/build-a-java-app-with-maven/
 */

public class SimpleCalculatorTest {

    /*@Test(expected = RuntimeException.class)
    public final void whenMoreThan2NumbersAreUsedThenExceptionIsThrown() {
        StringCalculator.add("1,2,3");
    }*/

    @Test
    public final void whenEmptyStringIsUsedThenReturnValueIs0() {
        Assert.assertEquals(0, StringCalculator.add(""));
    }


    @Test
    public final void whenOneNumberIsUsedThenReturnValueIsThatSameNumber() {
        Assert.assertEquals(3, StringCalculator.add("3"));
    }

    @Test
    public final void whenTwoNumbersAreUsedThenReturnValueIsTheirSum() {
        Assert.assertEquals(3 + 6, StringCalculator.add("3,6"));
    }


    @Test
    public final void whenAnyNumberOfNumbersIsUsedThenReturnValuesAreTheirSums() {
        Assert.assertEquals(3 + 6 + 15 + 18 + 46 + 33, StringCalculator.add("3,6,15,18,46,33"));
    }


}
