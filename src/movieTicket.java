public class movieTicket{
    public static void main(String[] srgs){
        /*
        * If you are a student / senior / both student and senior
        * then you will get a 10% / 20%  / 30% percent discount
        * for each ticket
        *
        * */

//        Declaring the variable
//        Please change true / false according to your wish for seeing different result.
        boolean isStudent = true;
        boolean isSenior = false;
        double price = 9.99;

        if(isStudent){
            if(isSenior){
                System.out.println("You get a Senior discount of 20%");
                System.out.println("You get a Student discount of 10%");
                System.out.println("Total of 30% discount together");
                price *=0.7;
            }
            else{
                System.out.println("You get a Student discount of 10%");
                price *= 0.9;
            }

        }
        else{
            if(isSenior){
                System.out.println("You get a Senior discount of 20%");
                price *= 0.8;
            }
            else{
                price *= 1;
            }

        }
        System.out.println("The price of your ticket is "+price +"$");

//        Or,
        System.out.printf("The price of ticket is %.2f$", price);

    }
}