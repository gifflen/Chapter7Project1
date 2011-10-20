import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by IntelliJ IDEA.
 * User: Gifflen
 * Date: 10/18/11
 * Time: 10:32 PM
 * To change this template use File | Settings | File Templates.
 */

public class Chapter7Problem1 {
    private static String get_input(){
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String input= "";
        while (input.length()==0){
            try {
                System.out.println("Please input a line to test for a palindrome. Type \"quit\" to exit.");
                input = in.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return input;
    }
    private static boolean check_for_palindrome(String input){
        String delims = "[ .,?!‽:;]+";
        String[] splitString = input.split(delims);
        Queue<String> queue = new LinkedList<String>();
        Stack<String> stack = new Stack<String>();
        //Iterate through values in the splitString with each output being the variable "word"
        for (String word : splitString){
            //Add each word to the queue and stack
            queue.add(word);
            stack.add(word);
        }
        while (!queue.isEmpty()){
            //Removes word from queue and compares it to the popped word from the stack
            int compare = queue.remove().compareToIgnoreCase(stack.pop());
            //We can return false here since if even 1 mismatch occurs it is false.
            if (compare!=0)
                return false;
        }
        return true;
    }
    public static void  main(String[] args){
        String userInput = "";
        while (!userInput.equals("quit")){
            userInput = get_input();
            if (!userInput.equals("quit")) {
                if (check_for_palindrome(userInput)) {
                    System.out.println(userInput + " is a palindrome");
                } else {
                    System.out.println(userInput + " is not a palindrome");
                }
            }
        }
        System.out.println("You have chosen to quit. GoodBye.");


    }
}
