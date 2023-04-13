public class Main {
    public static void main(String[] args) {
        String x = "water";
        String y = "Kool-Aid";

        System.out.println(x);
        System.out.println(y);

        String temp;
        temp = x;
        x = y;
        y = temp;

        System.out.println(x);
        System.out.println(y);
    }
}