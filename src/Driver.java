import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by IntelliJ IDEA.
 * User: Gifflen
 * Date: 10/18/11
 * Time: 10:32 PM
 * To change this template use File | Settings | File Templates.
 */
/*
String str = "This is a sentence.  This is a question, right?  Yes!  It is.";
String delims = "[ .,?!]+";
String[] tokens = str.split(delims);
 */
public class Driver {
    private String get_input(String delims){
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String input= "";
        while (input != ""){
            try {
                input = in.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return input;
    }
    private boolean check_for_palindrome(String input){

        return false;
    }
    public static void  main(String[] args){
            String delims = "[ .,?!;‽:]+";

    }
}
