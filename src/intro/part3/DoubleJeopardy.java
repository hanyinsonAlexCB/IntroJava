package intro.part3;

public class DoubleJeopardy {
    public static void main(String[] args) {
        double value = 32;
        int valor2 = 132;
        System.out.println("A double: " + value);
        System.out.println("A double: " + valor2);
        System.out.println((value >= valor2));
    }
}
