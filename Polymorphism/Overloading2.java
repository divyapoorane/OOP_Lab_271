class Result {

    int calculate(int marks1, int marks2) {
        return marks1 + marks2;
    }

    int calculate(int marks1, int marks2, int marks3) {
        return marks1 + marks2 + marks3;
    }

    double calculate(double totalMarks, int subjects) {
        return totalMarks / subjects;
    }

    public static void main(String[] args) {
        Result r = new Result();
        System.out.println("Total (2 subjects): " + r.calculate(80, 90));
        System.out.println("Total (3 subjects): " + r.calculate(70, 85, 90));
        System.out.println("Average: " + r.calculate(255, 3));
    }
}
