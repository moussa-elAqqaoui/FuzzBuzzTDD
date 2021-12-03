import java.util.ArrayList;
public class FizzBuzz {
    public String generate(Integer number) {
        String rep="";
        if(number%3 == 0 || number%5 == 0){
            rep = number%3 == 0 ? "FIZZ": rep;
            rep += number%5 == 0 ? "BUZZ": "";
        }
        else rep = number.toString();
        return rep;
    }
    public ArrayList<String> generate(int start, int end) {
        ArrayList<String> array = new ArrayList<>();
        for (int i = start-1; ++i <= end;array.add(generate(i)));
        return array;
    }
}
