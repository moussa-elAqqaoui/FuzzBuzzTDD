import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class FizzBuzzTest {
    FizzBuzz fizzBuzz;
    @Before
    public void initialize() {
        fizzBuzz = new FizzBuzz();
    }
    @Test
    public void test_unit(){
        Tester(1);Tester(3);Tester(5);Tester(6);
        Tester(15);Tester(30); Tester(35);
    }
    @Test
    public void test_sequence() {
        ArrayList<String> array = new ArrayList<String>();
        for(int i = 0; i++<100; array.add(generateHelper(i)));
        Assert.assertEquals(array,fizzBuzz.generate(1,100));
    }
    public void Tester(int number) {
        Assert.assertEquals(generateHelper(number), fizzBuzz.generate(number));
    }
    public String generateHelper(Integer number) {
        String rep="";
        if(number%3 == 0 || number%5 == 0){
            rep = number%3 == 0 ? "FIZZ": rep;
            rep += number%5 == 0 ? "BUZZ": "";
        }
        else rep = number.toString();
        return rep;
    }
}
