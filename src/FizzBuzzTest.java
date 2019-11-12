import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {

    @Test
    public void fizzBuzzConvertorLeaveNormalNumbersAlone() {

        FizzBuzzConvertor fizzbuzz = new FizzBuzzConvertor();

        Assert.assertEquals(  "1", fizzbuzz.convert(1));
        Assert.assertEquals(  "2", fizzbuzz.convert(2));

    }

    @Test
    public void multipleOfThree() {
        FizzBuzzConvertor fizzbuzz = new FizzBuzzConvertor();

        Assert.assertEquals(  "Fizz", fizzbuzz.convert(3));
    }

    @Test
    public void multipleOfFive() {
        FizzBuzzConvertor fizzbuzz = new FizzBuzzConvertor();

        Assert.assertEquals(  "Buzz", fizzbuzz.convert(5));
    }

    @Test
    public void multipleOfFifteen() {
        FizzBuzzConvertor fizzbuzz = new FizzBuzzConvertor();

        Assert.assertEquals(  "FizzBuzz", fizzbuzz.convert(15));
    }
}