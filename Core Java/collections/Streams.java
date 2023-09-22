import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,1,1,1,33,5,6,3,5,3);
        Stream<Integer> s1 = list.stream();

        /*
         * Streams can't be used more than once.
         * The benifit is stream provides a lot of methods
         * like filter, map
         */
        
        Stream<Integer> s2 = s1.filter(n -> n%2 == 0);
        
        //s2.forEach(n -> System.out.print(n));

        Stream<Integer> s3 = s2.map(n -> n*2);

        //s3.forEach(n -> System.out.println(n));

        int result = s3.reduce(0, (c,e) -> c + e);
        System.out.println(result);

        int answer = list.stream()
                        .filter(n -> n%2 == 0)
                        .map(n -> n*2)
                        .reduce(0, (c, e) -> c + 3);
                        
        System.out.println(answer);
    }
}
