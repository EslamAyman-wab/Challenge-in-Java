public class First_and_Last_Digit_Sum {
    public static void main(String[] args) {

        System.out.println(sumFirstAndLastDigit(257));


    }
    public static int sumFirstAndLastDigit(int number) {

        if (number < 0){
            return -1;
        }
        int firstDigit = number;
        int lastDigit  = number %10;

        while (firstDigit >= 10) {
            firstDigit /= 10;

        }
        return firstDigit + lastDigit ;
    }
}
