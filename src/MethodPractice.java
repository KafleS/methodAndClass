import javax.print.DocFlavor;

/**
 * CS152 Lab 4 -- Welcome to Methods.
 *
 * Implement all the methods described below.
 *
 * Student name: YOUR NAME GOES HERE.
 */
public class MethodPractice {

    /**
     * Returns middle value of its arguments.
     * @param x First argument
     * @param y Second argument
     * @param z Third argument
     * @return Middle value of x, y and z
     */
    public static int middleOfThree( int x, int y, int z) {
        // TODO: REPLACE THE METHOD BODY
        if ((x > y)&& ( x < z)){
            return x;
        }
        else if ((y > x)&& ( y < z)){
            return y;
        }
        else
            return z;

        // This is an obviously wrong return value
        // that exists only to allow the file to compil
    }

    /**
     * Is the character given a vowel?
     * A vowel is one of a, e, i, o, or u (upper or lower case)
     * @param c Character to check
     * @return True if c is a vowel, false if not
     */
    public static boolean isVowel(char c) {
        // TODO: REPLACE THE METHOD BODY
        if (  c== 'a'|| c== 'e'|| c== 'i'|| c== 'o'|| c== 'u'||   c== 'A'|| c== 'E'|| c== 'I'|| c== 'O'|| c== 'U'){
            return true;
        }
        return false;

        // Hardcoded value will be "correct" sometimes,
        // but you must make it work for all input
    }

    /**
     * Does the given string contain a vowel?
     * @param s String to check
     * @return True if s contains a vowel, false if not
     */
    public static boolean hasVowel(String s) {
        // TODO: REPLACE THE METHOD BODY

        // Again, hardcoding a value to compile

        for (int i = 0; i < s.length(); i++)
            if ((s.charAt(i) == 'a') ||(s.charAt(i) == 'e')||
                ( s.charAt(i) == 'i') || (s.charAt(i) == 'o' ||
                    (s.charAt(i) == 'u'))||
        (s.charAt(i) == 'A') ||(s.charAt(i) == 'E')||
                ( s.charAt(i) == 'I') || (s.charAt(i) == 'O' ||
                (s.charAt(i) == 'U'))) {
                return true;

            }
        return false;
    }

    /**
     * Create a new string containing the characters of the
     * given string in reverse order.
     * @param s The string to reverse
     * @return Reversed string.
     */
    public static String reverseString(String s) {
        // TODO: REPLACE THE METHOD BODY
        // Have to return something here to make the file compile
        char[]arr   = new char[s.length()];
         int j = 0;
        for (int i = s.length()-1; i >=0; i--){
           arr[j] = s.charAt(i);
           j++;

        }
        String reverse = "";
        for ( int i = 0; i< s.length();i++){
            reverse = reverse+arr[i];
        }
        return reverse;
    }

    /**
     * Average the length of up to five vowelless strings.
     * Any strings containing vowels are not included in this calculation.
     * @param a First string
     * @param b Second string
     * @param c Third string
     * @param d Fourth string
     * @param e Fifth string
     * @return Average length of the vowelless input strings.
     *         If all have vowels, returns -1000.
     */
    public static double averageUnvowelledLength(String a, String b, String c,
                                                 String d, String e) {
        // TODO: REPLACE THE METHOD BODY

        // This is an obviously wrong return value
        // that exists only to allow the file to compile
        double average = (a.length()+b.length()+c.length()+d.length()+e.length())/5;
        return  average;




    }


    // WRITE A METHOD FROM SCRATCH
    //
    // Write a method call countVowels that returns the number
    // of vowels in the given string.
    //
    // The method should take a single String argument and return an int
    //
    // Don't forget to use the public static modifiers
    public static int countVowels ( String s){
        int sum = 0;
        for ( int i = 0; i< s.length(); i++){
             if ((s.charAt(i) == 'a') ||(s.charAt(i) == 'e')||
                    ( s.charAt(i) == 'i') || (s.charAt(i) == 'o' ||
                    (s.charAt(i) == 'u'))||
                    (s.charAt(i) == 'A') ||(s.charAt(i) == 'E')||
                    ( s.charAt(i) == 'I') || (s.charAt(i) == 'O' ||
                    (s.charAt(i) == 'U'))){
                 sum++;
             }
        }
        return sum;
    }



    // WRITE A METHOD FROM SCRATCH
    //
    // Write a method called totalMealPrice that takes two
    // arguments, an int meal which is the cost of a meal, and a
    // double tip which represents the tip percentage one would add to
    // the bill.
    // The method must return a double which equals how much should be
    // paid.
    //
    // int meal must be greater than 0
    // double tip must be 0 or greater and .9 or less (no tips over 90%)
    // If either number is invalid, return -1;
    //
    // Don't forget to use the public static modifiers
    public static  double totalMealPrice( int meal, double tip){
        double totalprice = meal+meal*tip;
        if ( (meal< 1) || ((tip<0.0) || (tip>9.0) )){
            return -1;

        }
        return totalprice;

    }





    // This code tests your program's completeness.
    public static void main(String[] args) {
        int numCorrect = 0;

        if( middleOfThree(1, 2, 3) == 2) { numCorrect++; }
        if( middleOfThree(4, -5, 3) == 3) { numCorrect++; }
        if( middleOfThree(5, 7, 0) == 5) { numCorrect++; }
        if( middleOfThree(-1, -2, 3) == -1) { numCorrect++; }

        if( !isVowel('x') ) { numCorrect++; }
        if( !isVowel('5') ) { numCorrect++; }
        if( isVowel('A') ) { numCorrect++; }
        if( isVowel('E') ) { numCorrect++; }
        if( isVowel('i') ) { numCorrect++; }
        if( isVowel('o') ) { numCorrect++; }
        if( isVowel('U') ) { numCorrect++; }

        if( !hasVowel("") ) { numCorrect++; }
        if( hasVowel("banana") ) { numCorrect++; }
        if( hasVowel("Old") ) { numCorrect++; }
        if( !hasVowel("rhythm") ) { numCorrect++; }
        if( !hasVowel("L33T") ) { numCorrect++; }

        if( reverseString("").equals("")) { numCorrect++; }
        if( reverseString("abcde").equals("edcba")) { numCorrect++; }
        if( reverseString("Hello, World!").equals("!dlroW ,olleH")) { numCorrect++; }

//        if( averageUnvowelledLength("", "abc", "banana", "oops", "xyz") == 1.5) { numCorrect++; }
//        if( averageUnvowelledLength("The quick", "brown fox", "jumped", "over the", "lazy dog") == -1000.0) { numCorrect++; }
//        if( averageUnvowelledLength("123", "4567", "890", "jkl;vbnm", "!@#$%^*&") == 5.2) { numCorrect++; }

         //Uncomment these tests AFTER IMPLEMENTING countVowels
         if( countVowels("L33T rhythm") == 0) { numCorrect++; }
         if( countVowels("abcdefghijklmNOPQRSTUVWZYZ") == 5) { numCorrect++; }
         if( countVowels("One TWO 3 four FIVE") == 7) { numCorrect++; }

        // Uncomment these tests AFTER IMPLEMENTING totalMealPrice
         if( totalMealPrice( 0, .3 ) == -1 ) { numCorrect++; }
         if( totalMealPrice( 10, .2 ) == 12.0 ) { numCorrect++; }
         if( totalMealPrice( 100, .5 ) == 150 ) { numCorrect++; }
         if( totalMealPrice( 100, .91 ) == -1 ) { numCorrect++; }
         if( totalMealPrice( 120, .32 ) == 158.4 ) { numCorrect++; }

        System.out.println( "Your program's completeness is currently: "
                + numCorrect + "/30" );
    }

}