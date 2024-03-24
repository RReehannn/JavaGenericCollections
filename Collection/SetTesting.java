package Collection;

import java.util.HashSet;
import java.util.Set;

//Does not allow duplicate elements
// It does not guarantee any specific ordering of Elements.
public class SetTesting {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        System.out.println(names.add("Mohammad"));
        System.out.println(names.add("Rehan"));
        System.out.println(names.add("Shakeel"));

        for (String str: names){
            System.out.println(str);
        }

    }

}
