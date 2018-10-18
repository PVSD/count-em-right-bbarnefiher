package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner stringReader = new Scanner (System.in);
        String userInput;
        String[] sp;

        while (true){
            System.out.println("Type in a sentence and press ENTER.");
            userInput = stringReader.nextLine();
            userInput = userInput.toUpperCase();
            userInput += ":)";
            sp = userInput.split("S\\s*A");

            if (userInput.equals("EXIT:)")) {
                break;


            }
            System.out.println("There are " + (sp.length - 1) + " occurrences. \n");
        }
    }
}
