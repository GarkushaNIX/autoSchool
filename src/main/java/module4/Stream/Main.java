package module4.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("");
        for (int i=0; i < 50; i++) list.add(randomString());
        list.add("");

        System.out.println("\nAll items:\n");
        list.forEach(System.out::println);

        System.out.println("\nLength of every item on the list:\n");
        list.forEach(string -> System.out.println(string.length()));

        System.out.println("\nAll nonempty items without symbol \"d\"\n");
        list.stream().filter(string -> (string.length() > 0)&&!(string.contains("d"))).forEach(System.out::println);

        System.out.println("\nList in alphabet order:\n");
        list.stream().sorted().forEach(System.out::println);

    }

    private static String randomString(){
        Random random = new Random();
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = random.nextInt(20);

        StringBuilder buffer = new StringBuilder(targetStringLength);

        for (int i = 0; i < targetStringLength; i++) {
            int randomLimitedInt = leftLimit + (int)
                    (random.nextFloat() * (rightLimit - leftLimit + 1));
            buffer.append((char) randomLimitedInt);
        }

        return buffer.toString();
    }
}
