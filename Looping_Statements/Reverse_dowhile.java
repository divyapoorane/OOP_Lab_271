public class Reverse_dowhile {
    public static void main(String[] args) {
        int n = 1234;
        int rev = 0;
        do {
            rev = rev * 10 + (n % 10);
            n = n / 10;
        } while (n > 0);

        System.out.println(rev);
    }
}
