package Wrapper;
// Autoboxing: Autoboxing conversion of primitive types to their corresponding wrapper class as objects.
// Unboxing: Autoboxing conversion of wrapper class objects their respective primitive types.

public class AutoBoxing {
    public static void main(String[] args) {
        Integer first = 55; //This is Autoboxing.
        int second = first; //This is Un_Autoboxing
        System.out.println(first);
        System.out.println(second);

        // Output:
        // 55
        // 55

    }
}
