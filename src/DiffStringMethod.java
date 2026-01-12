public class DiffStringMethod {
    public static void main (String[] args){

//        First Declare a String
        String name = "String is a collection of Character";

//        Checking the different methods of String
//        1. length() - Determine the Length of the String
//           This will also count space
        int lengthOfString = name.length();
        System.out.println("Length of String is: "+ lengthOfString);



//        2. charAt() - Determines in which index which character is present.
//                      This starts at 0 index.

        char indexOfLetter = name.charAt(4);
        System.out.println("At index 4 '" + indexOfLetter + "' is present");

//        indexOf() - Find a letter in given Index
//                    Starts with index 0
        int findLetterInGivenIndex = name.indexOf('r');
        System.out.println("Letter 'r' is in index "+ findLetterInGivenIndex);

//        lastIndexOf() - Find the last index of a given letter
//                        Starts with index 0

        int lastIndexOfALetter = name.lastIndexOf('r');
        System.out.println("Last index of the a Letter is: "+ lastIndexOfALetter);

//        toUpperCase() - Change the string in upper case
        String inUpperCase = name.toUpperCase();
        System.out.println("Result: "+ inUpperCase);

//        toLowerCase() - Change the string in upper case
        String inLowerCase = name.toLowerCase();
        System.out.println("Result: "+ inLowerCase);

//        trim() - Trim space from any String
        String stringWithSpace = "      This Sting has a space in both side   ";
        System.out.println(stringWithSpace);
        stringWithSpace = stringWithSpace.trim();
        System.out.println("Result: "+ stringWithSpace);

//        replace() - Replace any letter with another letter inside String
        name = name.replace("a", "@");
        System.out.println("Result: "+ name);

//        isEmpty() - Check if the string is empty
//        if no space than true
        String toCheckEmptyWithoutSpace = "";
        System.out.println(toCheckEmptyWithoutSpace.isEmpty());

//        if space then false
        String toCheckEmptyWithSpace = " ";
        System.out.println(toCheckEmptyWithSpace.isEmpty());


//        isBlank() - check if the string is blank
//        with/ without space it is true
        String toCheckBlank = " ";
        System.out.println(toCheckBlank.isBlank());


//        contains() - To check if it contains specific things
//                     This is very sensitive if you write 's' and not 'S' you will only see 's'


        String toCheckContain = "In this String we will check contain";
        if(toCheckContain.contains(" ")){
            System.out.println("Your name contains SPACE");
        }
        else{
            System.out.println("NO space");
        }

        /*
        * Some more methods are
        * equals()
        * equalsIgnoreCase()
        * */

    }
}
