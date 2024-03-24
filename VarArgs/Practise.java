package VarArgs;

public class Practise {
    static void printMany(String ...elements){
        for (String element: elements){
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        printMany("One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten");
        printMany();
        printMany("Rehan", "Faizan", "Imran", "Rizwan");
    }
}
