//import java.util.Scanner;  // Import the Scanner class

class Hello {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter username");

    String userName = myObj.nextLine();  // Read user input
    System.out.println("Username is: ");  // Output user input
  }
}
