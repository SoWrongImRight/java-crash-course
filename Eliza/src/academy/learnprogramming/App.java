package academy.learnprogramming;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println(Doctor.intro());
        var userInput = "";
        userInput = scanner.nextLine();

        while (!userInput.equalsIgnoreCase("quit")) {
            userInput = scanner.nextLine();
            String response = Doctor.response(UserInput);
            System.out.println(response); 
        }

        scanner.close();
    }
}
