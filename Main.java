import java.util.Scanner;

/**
 * a program to determine what percentage grade you got
 * @author Daniel Rahmani
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // Create a scanner for user input
    Scanner input = new Scanner(System.in);

    // get the grade from the user
    System.out.println("Please enter your letter grade. (A, B, C, D, F)");
    String userGrade = input.nextLine();

    switch(userGrade) {
      case "A": 
        System.out.println("Your grade is between 80% and 100%");
        break;
      case "B":
        System.out.println("Your grade is between 70% and 79%");
        break;
      case "C":
        System.out.println("Your grade is between 60% and 69%");
        break;
      case "D":
        System.out.println("Your grade is between 50% and 59%");
        break;
      case "F":
        System.out.println("Your grade is between 0% and 49%");
    }
    
  }
}
