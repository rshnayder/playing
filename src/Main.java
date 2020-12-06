import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        String word = "AGGRTFR";
        int size = word.length();
        int counter = 0;
        while (counter != size-1) {
            int n = 1;
            char s = word.charAt(counter);
            for (int i = 1; i < word.length(); i++) {
                if (s == word.charAt(i)) {
                    n++;
                }
            }
            word = word.replace(s, '\0');
            System.out.println(word);
            counter++;
            System.out.print(n);
            System.out.println(s);
        }
    }
}
