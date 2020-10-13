public class Calculator {
    public static void main(String[] args) {
        int a = 7;
        int b = 2;

        char sign = '%';

        if (sign == '+') {
            int plus = a + b;
            System.out.println(plus);

        } else if (sign == '-') {
            int minus = a - b;
            System.out.println(minus);

        } else if (sign == '*') {
            int multiplication = a * b;
            System.out.println(multiplication);

        } else if (sign == '^') {
            int degree = 3;
            int result = 1;
                for (int i = 0; i < degree; i++) {
                    result = result * a;
            }
                System.out.println(result);

        } else if (sign == '%') {
            int remains = a % b;
            System.out.println(remains);

        } else if (sign == '/') {
            float  division = a / b;
            System.out.println(division);
        }
    }
}
