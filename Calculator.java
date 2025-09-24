public class Calculator {
    // TODO: Create multiple versions of a 'multiply' method that can handle:
    // 1. Two integers
    public static int multiply(int num1, int num2) {
        int result;
        result = num1 * num2;
        return  result;
    }
    // 2. Three integers
    public static int multiply(int num1, int num2, int num3) {
        int result;
        result = num1 * num2 * num3;
        return result;
    }
    // 3. Two double values
    public static double multiply(double double1, double double2) {
        double result;
        result = double1 * double2;
        return result;
    }
    // 4. An integer and a string (repeat the string that many times)
    public static String multiply(int counter, String string) {
        String result = "";
        for (int i = 0; i < counter; i++) {
            result += string;
        }
        return result;
    }

    public static void main(String[] args) {
        // Test all your overloaded methods
        System.out.println("Two ints: " + multiply(5, 3));
        System.out.println("Three ints: " + multiply(5, 3, 2));
        System.out.println("Two doubles: " + multiply(5.5, 3.2));
        System.out.println("Int and string: " + multiply(3, "Hi!"));
    }
}