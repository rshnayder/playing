package RestAssured;

import RestAssured.json.Flower;
import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class Testing {
    public static void main(String[] args) throws IOException {
//
//        String fileName = "files/data.json";
//
//        Gson gson = new Gson();
//        try (
//            FileReader file = new FileReader(fileName);
//            JsonReader reader = new JsonReader(file);
//        ) {
//            Flower[] data = gson.fromJson(reader, Flower[].class);
//            for (Flower flower : data) {
//                System.out.println(flower.toString());
//            }
//        }

        List<Integer> s = Arrays.asList(3, 5, 6, 1, 0);
//        Consumer<List<Integer>> cons = Testing::doubling;
//        System.out.println(copies3(s).toString());
        no9(s).forEach(System.out::println);
    }

    public List<String> copies3(List<String> strings) {
        return strings.stream()
                .map(s -> s +"")
                .collect(Collectors.toList());
    }

    public List<Integer> rightDigit(List<Integer> nums) {
        return nums.stream()
                .map(String::valueOf)
                .map(n -> Integer.valueOf(n))
                .collect(Collectors.toList());
    }

    public List<Integer> math1(List<Integer> nums) {
        UnaryOperator<List<Integer>> f = n ->
                n.stream()
                        .map(x -> (x + 1) * 10)
                        .collect(Collectors.toList());
        return f.apply(nums);
    }

    public List<Integer> noNeg(List<Integer> nums) {
        return nums.stream()
                .filter(x -> x < 0)
                .collect(Collectors.toList());
    }

    public static List<Integer> no9(List<Integer> nums) {
        return nums.stream()
                .filter(n -> n <= 13)
                .collect(Collectors.toList());
    }

}
