// Area of triangle
import java.util.Scanner;
class area{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the length of the triangle: ");
        double l=sc.nextDouble();
        System.out.println("Enter the breadth of the triangle: ");
        double b=sc.nextDouble();
        double area= 0.5*(l*b);
        System.out.println("The area of the triangle is "+ area);
    }
}