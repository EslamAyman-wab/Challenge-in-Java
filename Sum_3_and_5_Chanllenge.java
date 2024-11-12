public class Sum_3_and_5_Chanllenge {
    public static void main(String[] args) {

        int sum = 0;
        int count = 0;

        for (int i = 1; i < 1000; i++){

            if (i % 3 == 0 && i % 5 == 0){
                count ++;
                sum += i;// sum = sum + int

                System.out.println("Number %3 and %5 is " + i);
            }
            if (count  == 5){
                break;
            }
        }
        System.out.println("The sum =" +sum);

    }
}
