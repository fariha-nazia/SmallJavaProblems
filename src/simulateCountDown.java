import java.util.Scanner;

public class simulateCountDown {
    public static void main(String[] args) throws InterruptedException {
        /*
        * Simulate a Countdown
        *  - Take user input
        * */
        Scanner scan = new Scanner(System.in);
//        Declare the variable
        int start;
        System.out.println("Enter the start Number: ");
        start = scan.nextInt();


        for( int i = start; i > 0 ; i--){
            System.out.println("Tick Tick "+ i);

            /*
            * Let use a thread class and
            * sleep method to the time between each loop
            * This is usually in milli sec
            * */
            Thread.sleep(1000);
        }
        System.out.println("Happy New Year!");


        scan.close();
    }
}
