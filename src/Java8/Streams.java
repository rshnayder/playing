package Java8;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class Streams {

    public static void main(String[] args) throws IOException {


        List<String> list = Arrays.asList("gfd", "Sdr", "vhnr", "wef", "abrt");
        Collections.sort(list, (s1, s2) -> s1.compareTo(s2));
        System.out.println(list.toString());
    }
}
