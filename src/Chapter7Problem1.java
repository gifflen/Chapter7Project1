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
/*
String str = "This is a sentence.  This is a question, right?  Yes!  It is.";
String delims = "[ .,?!]+";
String[] tokens = str.split(delims);
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
        String delims = "[ .,?!;]+";
        String[] splitString = input.split(delims);
        Queue<String> queue = new LinkedList<String>();
        Stack<String> stack = new Stack<String>();
        for (String word : splitString){
            if (word.length()!=0){
                System.out.println(word);
                queue.add(word);
                stack.add(word);
            }
        }
        while (!queue.isEmpty()){
            int compare = queue.remove().compareToIgnoreCase(stack.pop());
            if (compare!=0)
                return false;
        }
        return true;
    }
    public static void  main(String[] args){
        String userInput = "";
        while (!userInput.equals("quit")){
            userInput = get_input();
            System.out.println(userInput);
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
