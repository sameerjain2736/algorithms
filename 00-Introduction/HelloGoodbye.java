public class HelloGoodbye {
    public static void main (String[] args) {
        String nameA = args[0];
        String nameB = args[1];
        System.out.printf("Hello %s and %s.\n", nameA, nameB);
        System.out.printf("Goodbye %s and %s.", nameB, nameA);
    }
}