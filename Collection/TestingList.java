package Collection;

import java.util.ArrayList;
import java.util.List;

// List is an order of Collection

public class TestingList {
    public static void main(String[] args) {
        List<String> strlist = new ArrayList<>();
        strlist.add("Rehan");
        strlist.add("Rizwan");
        strlist.add("Imran");
        strlist.add("Faizan");

        strlist.add(2,"Shakeel Ahmad");
        strlist.remove(2);
        System.out.println(strlist.size());


        for (int i = 0; i < strlist.size(); i++){
            System.out.println(strlist.get(i));
        }
        System.out.println("\n Output with the For Each Loop\n");
        for (String str : strlist){
            System.out.println(str);
        }


    }
}

// <String> This generic And exit only at compile Time.
// This Symbol is <> ( known as Diamond)
