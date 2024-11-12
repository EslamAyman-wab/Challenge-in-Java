import java.util.Scanner;

public class Main_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("What year we are");

        int currentYear = sc.nextInt();

        System.out.println(getInputFromScanner(currentYear));

    }
    public static String getInputFromScanner(int currentYear){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hi , What's your name?");
        String name = scanner.nextLine();

        System.out.println("Hi " + name + " . Thanks for taking the course!");

        System.out.println("What year were you born? ");

        boolean validDoB= false;
        int age = 0;

        do {
            System.out.println("Enter a year of birth >=" + (currentYear - 125) + "and <="+ (currentYear));
            try {
                age = checkData(currentYear, scanner.nextLine());
                validDoB = age < 0 ? false : true;
            } catch (NumberFormatException badUserData) {
                System.out.println("Invalid input. Try again.");
            }

        } while (!validDoB);



        return "So you are " +  age +" years old.";
    }
    public static int checkData (int currentYear, String dateOfBirth){

        int dob = Integer.parseInt(dateOfBirth);
        int minimumYear = currentYear - 125;

        if (dob < minimumYear || dob > currentYear){
            return -1;
        }
        return (currentYear -dob);
    }
}
