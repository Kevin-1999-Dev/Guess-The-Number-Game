import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int result = (int)Math.floor(Math.random()*50);
        int time = 5;
        System.out.println("The number is chosen between 1 to 50 by computer.Guess the number within "+time+" times.");
        int i;
        for(i=0;i<time;i++){
            System.out.print("Guess the number:");
            int userInput = scanner.nextInt();
            if(userInput == result){
                System.out.println("Congratulation! You guessed the number.");
                break;
            }else{
                if(userInput < result){
                    System.out.println("The number is greater than " + userInput);
                }
                if(userInput > result){
                    System.out.println("The number is less than " + userInput);
                }
            }
        }
        if(i == time){
            System.out.println("You have already choosen "+time+" times.Game Over.");
            System.out.println("The number was " + result);
        }
    }
}