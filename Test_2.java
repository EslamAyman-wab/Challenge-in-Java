public class Test_2 {
        public static void main(String[] args) {
            int number = -125; // Example number
            int sum = sumDigits(number);
            System.out.println("Sum of digits: " + sum);
        }

        public static int sumDigits(int number) {
            if (number < 0) {
                number = Math.abs(number); // Make the number positive
            }

            int sum = 0;
            while (number != 0) {
                sum += number % 10; // Add the last digit to the sum
                number /= 10;       // Remove the last digit from the number
            }

            return sum;
        }

}
