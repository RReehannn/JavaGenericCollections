package VarArgs;

public class VarArgs {
    public static void main(String... args) {
        System.out.println();
        System.out.println(sum(4,5,9,3,4,7,70,88,63,45,12,300));


    }

    public static int sum(int... a){
        int sum =0;
        for (int i : a){
            sum += i;
        }
        return sum;
    }
}
