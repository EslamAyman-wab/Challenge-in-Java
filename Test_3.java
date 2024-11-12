import java.util.Scanner;

public class Test_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        int  value = sc.nextInt();
//        if (value == 1 ){
//            System.out.println("Value was 1");
//        } else if (value == 2 ){
////            System.out.println("Value was 2");
////        } else if (value == 3 ){
////            System.out.println("Value was 3");
////        }
//
//         int switchValue = sc.nextInt();
////         switch(switchValue){
////             case 1:
////                 System.out.println("1");
////                 break;
////                 case 2:
////                     System.out.println("2");
////                     break;
////         }

        String month = sc.nextLine();
        System.out.println(month + " is in the " + geQuarter(month) + " quarter");
    }
    public static String geQuarter(String month){

        return switch (month) {
            case "January", "February", "March" -> "1st";
            case "April", "May", "June" -> "2nd";
            case "July", "August", "September" -> "3rd";  
            case "October", "November", "December" -> "4th";
            default -> "bad";
        };
    }

}
