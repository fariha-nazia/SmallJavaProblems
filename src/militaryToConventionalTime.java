import java.util.Scanner;

public class militaryToConventionalTime {
    public static void main(String[] args){
        /*
        * Input the military time and the prog will
        * tell you if its AM or PM
        * */

        Scanner scan = new Scanner(System.in);
        int hour;
        System.out.println("Enter Military Time: ");
        hour = scan.nextInt();

        String timeOfDay = (hour < 12 ) ? "AM" : "PM";
        System.out.println(timeOfDay);



        scan.close();
    }

}
