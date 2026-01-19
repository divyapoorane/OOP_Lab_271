public class Reverse_for {
    public static void main(String[] args) {
        int n = 1234;
        int rev = 0;
        for (; n > 0; n = n / 10) {
            rev = rev * 10 + (n % 10);
        }
        System.out.println(rev);
    }
}