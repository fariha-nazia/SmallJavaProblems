import java.util.Scanner;
public class weightConverter {
    public static void main(String[] args){
        /*
        * Weight conversion program
        * This prog will take user input of weight in pounds / kilogram
        * And the weigh will be converted to kilogram / pounds
        *   option 1: pounds (lbs) to kilogram (kg)
        *   option 2: kilogram (kg) to pound (lbs)
        * Else say no other option present
        * */

//        Take user input
        Scanner scan = new Scanner(System.in);

//        Declare the variables
        double weight;
        double newWeight;
        int choice;

//        Welcome text
        System.out.println("Your Weight Conversion Program");
//        Option text
        System.out.println("1: Convert lbs to kg");
        System.out.println("2: Convert kg to lbs");
//        Choice text
        System.out.print("Choose an option: ");
        choice = scan.nextInt();
        System.out.println(choice);

        if(choice == 1){
            System.out.println("Enter the weight in lbs");
            weight = scan.nextDouble();
            newWeight = weight * 0.453592;
            System.out.println("Your weight in kg is: "+ newWeight);
        }
        else if (choice == 2){
            System.out.println("Enter your weight in kg");
            weight = scan.nextDouble();
            newWeight = weight * 2.20462;
            System.out.println("Your weight in lbs is: "+newWeight);
        }
        else{
            System.out.println("Invalid Choice");
        }





        scan.close();

    }
}
