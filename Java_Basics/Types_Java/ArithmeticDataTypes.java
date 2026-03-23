import java.util.Scanner;

public class ArithmeticDataTypes{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a byte value: ");
        byte b = sc.nextByte();

        System.out.print("Enter a short value: ");
        short s = sc.nextShort();

        System.out.print("Enter an int value: ");
        int i = sc.nextInt();

        System.out.print("Enter a long value: ");
        long l = sc.nextLong();

        System.out.print("Enter a float value: ");
        float f = sc.nextFloat();

        System.out.print("Enter a double value: ");
        double d = sc.nextDouble();

        System.out.println("Byte + Short = " + (b + s));
        System.out.println("Int * Byte = " + (i * b));
        System.out.println("Long - Int = " + (l - i));
        System.out.println("Float / Short = " + (f / s));
        System.out.println("Double + Float = " + (d + f));
        System.out.println("Sum of all: " + (b + s + i + l + f + d));

    }
}
