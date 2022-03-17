package arrayListStream;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        /** Integer массивден жуп сандарды терип алынызда алардын квадраттарынын эн чонун табыныз.
         */
        ArrayList<Integer> arrayList1 = new ArrayList<Integer>(List.of(1,2,3,4,5,6,7,8,9,10));
        arrayList1.stream().filter(x -> x % 2 == 0).   map(x -> x * x).max(Integer::compare).ifPresent(System.out::println);

        
    }
}
