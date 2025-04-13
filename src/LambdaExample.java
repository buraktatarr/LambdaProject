import java.util.ArrayList;
import java.util.List;

public class LambdaExample {

    public static void main(String[] args) {

        // Öncelikle bir ArrayList oluşturuyoruz;
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        // Sayıları iki katına çıkarmak için eskiden şu şekilde yazardık;

        /* for (int i = 0; i < numbers.size(); i++) {
        numbers.set(i, numbers.get(i) * 2); }
        for (int number : numbers) { System.out.println(number);}
        */

        // Onun yerine Lambda ile bu şekilde yazabiliyoruz;
        numbers.replaceAll(n -> n*2);
        numbers.forEach(System.out::println);
    }
}