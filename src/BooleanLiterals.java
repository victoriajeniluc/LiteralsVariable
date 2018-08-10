/**
 * Class to show examples of boolean literals
 * HOW THE CODE IS RAN:

 *FIRST METHOD TO LOOK AT: checkBoolean()
    * Line 32
        * Created a method named checkBoolean() that returns back a string
    * Line 33
        * Created a boolean to test with named testBoolean and gave it a data type of a boolean literal (true)
    * Line 34
        * Declared a variable named prompt with a data type of a string literal
    * Line 36
        * Created a conditional statement to verify testBoolean and return a statement which in this case is prompt
    * Since the first conditional statement always returns true, I was able to write it as trueFalse without saying: testBoolean == true -- ability to simplify the code

 * THEN NEXT METHOD TO LOOK AT: main()
    * Line 26&27
        * Created a method that called another method and set its value to a string literal named results
    * Line 28
        * Print out the value of results
    * Line 29
        * Print out a boolean literal
 *
 * @author Udayan Khattry
 */

public class BooleanLiterals {
    public static void main(String[] args) {
        String results = checkBoolean();
        System.out.println(results);
        System.out.println(false);
    }

    private static String checkBoolean() {
        boolean testBoolean = true;
        String prompt;

        if (testBoolean) {
            prompt = "YAY THIS IS TRUE";
        } else {
           prompt = "NO THIS IS NOT TRUE";
        }
        return prompt;
    }

}
