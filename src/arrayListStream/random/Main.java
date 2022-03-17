package arrayListStream.random;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arrayList.add(random.nextInt(20));
        }
        arrayList.stream().filter(x -> x % 2 == 0).   map(x -> x * x).max(Integer::compare).ifPresent(System.out::println);

    }
}
