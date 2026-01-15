import java.util.Scanner;

public class forLoop {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter how many times you want to loop: ");
        int max = scan.nextInt();

        for( int i = 1 ; i <= max; i++){
            System.out.println("Number of times the loop worked: "+ i);

        }







        scan.close();
    }
}
