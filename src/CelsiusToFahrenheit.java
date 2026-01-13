import java.sql.SQLOutput;
import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args){

        /*
        * This program will convert Celsius to Fahrenheit and
        * Fahrenheit to Celsius
        *   - This prog will take user input
        * */

        Scanner scan = new Scanner(System.in);

        double temp; // take from user
        double newTemp;
        String unit; // C or F, take from user

        System.out.println("Enter the temperature: ");
        temp = scan.nextDouble();
        System.out.println(temp);

        System.out.println("Please Select");
        System.out.println("C: Convert to Celsius");
        System.out.println("F: Convert to fahrenheit");
        unit = scan.next().toUpperCase();
        System.out.println(unit);

//        ternary operation and converting formula
        newTemp = (unit.equals("C")) ? (temp - 32) * 5 / 9 : (temp * 5 / 9) + 32;
        System.out.println(newTemp + "⁰" + unit);
        System.out.printf("Result %.2f⁰ %s", newTemp, unit);




        scan.close();

    }
}
