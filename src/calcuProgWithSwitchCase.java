import java.util.Scanner;

public class calcuProgWithSwitchCase {
    public static void main(String [] args){

        Scanner scan = new Scanner(System.in);

//        Declare the variables
        double num1;
        double num2;
        char operator;
        double result = 0;
        boolean validOperation = true;

        System.out.print("Enter 1st number: ");
        num1 = scan.nextDouble();
        System.out.println(num1);

        System.out.println("Enter 2nd number: ");
        num2 = scan.nextDouble();
        System.out.println(num2);

        System.out.println("Select Operation (+ , - , * , /, ^ ): ");
        operator = scan.next().charAt(0);
        System.out.println(operator);

        switch (operator){
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> {
                if(num2 == 0){
                    System.out.println("Can not divide by 0");
                    validOperation = false;
                             }
                else{ result = num1 / num2;}
                        }
            case '^' -> result = Math.pow(num1, num2);
            default -> {
                System.out.println("Invalid Input");
                validOperation = false;
            }
        }

        if(validOperation){
            System.out.println(result);
        }





        scan.close();
    }
}
