package app;

public class Nuber {

    public static String even_odd(int number) {
        return (number % 2 == 0) ? "Even" : "Odd";
    }

    public static void main(String[] args) {
        System.out.println(even_odd(34));
    }

}