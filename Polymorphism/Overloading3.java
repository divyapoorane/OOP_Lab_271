class AreaCalculator {

    double area(double radius) {
        return 3.14 * radius * radius; // Circle
    }

    double area(double length, double width) {
        return length * width; // Rectangle
    }

    double area(int base, int height) {
        return 0.5 * base * height; // Triangle
    }

    public static void main(String[] args) {
        AreaCalculator obj = new AreaCalculator();
        System.out.println("Circle: " + obj.area(5));
        System.out.println("Rectangle: " + obj.area(4, 6));
        System.out.println("Triangle: " + obj.area(3, 8));
    }
}
