package Wrapper;
// Wrapper class provides the way to use primitive data types as objects.
//Once created, the value of a wrapper object can't be changes.
// Wrapper class provide lots of default methods.

public class TestingWrapper {
    public static void main(String[] args) {
        Integer first = 55; //Direct
        Integer second = Integer.valueOf(66);
        Float third = Float.valueOf("55.63");
        Long fourth = Long.valueOf("669635984");
        Double fifth = 56988.55;
        Integer eight = null;
        System.out.println(fifth);
        System.out.println(first);

    }
}
