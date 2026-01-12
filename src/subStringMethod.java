import java.util.Scanner;

public class subStringMethod {
    public static void main(String[] args){
        /*
        * SubString is a method used to extract a portion of a string
        *           .substring(start)
        *           .substring(end)
        * */

//        Declaring the variables
//        This method is not very flexible
        String email = "Bro123@gmail.com";

//        subString (start to end)
        String userName = email.substring(0, 6);
        String domainName = email.substring(7, 16);
        System.out.println(userName);
        System.out.println(domainName);
        System.out.println(email.substring(7));

//        Let's try a more flexible method to use subString
        String email1 = "testEmail123@gmail.com";
        String userName1 = email1.substring(0, email1.indexOf("@"));
        String domainName1 = email1.substring(email1.indexOf("@"));

        System.out.println(userName1);
        System.out.println(domainName1);

//        Take User Input
        Scanner scan = new Scanner(System.in);
//        Declare the variables
        String emailAd;
        String userNameAd;
        String domainNameAd;

        System.out.println("Enter Your Email Address: ");
        emailAd = scan.nextLine();
        userNameAd = emailAd.substring(0, emailAd.indexOf("@"));
        domainNameAd = emailAd.substring(emailAd.indexOf("@") );

        System.out.println(userNameAd);
        System.out.println(domainNameAd);


        scan.close();




    }
}
