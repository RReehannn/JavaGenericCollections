package Collection;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

public class TestingCollection {
    public static void main(String[] args) {
        List<Integer> numList = new ArrayList<>();
        numList.add(5);
        numList.add(2);
        numList.add(8);
        numList.add(-55);

        Collections.sort(numList); // This is the class were so many Static method



        for (Integer str : numList){
            System.out.println("Collection is: " + str);
        }
        System.out.println("\nReverse the list\n");
        Collections.reverse(numList); // Collections class were so many Static method like reverse
        for (Integer str : numList){
            System.out.println("Collection is: " + str);
        }

    }


}
