public class Task3 {
    public static void main(String[] args) {

        double[] digits = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 9.9};

        for (int i = 0; i < digits.length; i++) {
            double digit = digits[i];
            if (digit % 3 == 0 && digit != 0) {
                System.out.println(digit);
            }
        }
    }
}
