package Practice;

class VarArgs {
    public static void main(String[] args) {
        System.out.println(concatenate("Rehan"));
        System.out.println(concatenate("Rehan", "Shakeel"));
        System.out.println(concatenate("Rehanshakeel", "786", "@gmail.com"));
    }
    public static String concatenate(String... strs){
        StringBuilder sb = new StringBuilder();
        for (String str: strs){
            sb.append(str).append(" ");
        }
        return sb.toString();

    }

}
