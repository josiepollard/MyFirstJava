import org.junit.Test;

public class FizzBuzz {
    @Test
    public void outputFizzbuzz() {

        FizzBuzzConvertor fizzBuzz = new FizzBuzzConvertor();
        for(int i=1; i<= 100; i++) {
            System.out.println(fizzBuzz.convert(i));

        }
    }
}
