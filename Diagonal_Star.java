
public class Diagonal_Star {
    public static void main(String[] args) {


        printSquareStar(5);
    }
    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
        } else {
            for (int row = 0; row < number; row++) { // start from 0
                for (int col = 0; col < number; col++) { // start from 0
                    if (row == 0 || row == number - 1 || col == 0 || col == number - 1
                            || row == col || col == number - row - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }

}
