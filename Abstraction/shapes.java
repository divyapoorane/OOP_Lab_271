abstract class Shape {

    abstract void calculateArea();
}

class Circle extends Shape {

    double radius;

    Circle(double r) {
        radius = r;
    }

    @Override
    void calculateArea() {
        double area = 3.14 * radius * radius;
        System.out.println("Circle Area: " + area);
    }
}

class Rectangle extends Shape {

    double length, width;

    Rectangle(double l, double w) {
        length = l;
        width = w;
    }

    @Override
    void calculateArea() {
        double area = length * width;
        System.out.println("Rectangle Area: " + area);
    }
}

class Triangle extends Shape {

    double base, height;

    Triangle(double b, double h) {
        base = b;
        height = h;
    }

    @Override
    void calculateArea() {
        double area = 0.5 * base * height;
        System.out.println("Triangle Area: " + area);
    }
}

public class shapes {
    public static void main(String[] args) {

        Shape s;

        s = new Circle(5);
        s.calculateArea();

        s = new Rectangle(4, 6);
        s.calculateArea();

        s = new Triangle(3, 8);
        s.calculateArea();
    }
}