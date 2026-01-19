public class Jump_Statements {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 2)
                continue;   // skip 2
            if (i == 4)
                break;      // stop loop at 4

            System.out.println(i);
        }
    }
}
