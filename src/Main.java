import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Welcome to User Registration System which ensures all validations are in place during a User Entry.");
    	Scanner scanner = new Scanner(System.in);

        User user = new User();

        System.out.print("Enter First Name: ");
        String inputFirstName = scanner.nextLine();

        user.setFirstName(inputFirstName);

        boolean isValid = user.validateFirstName();
        if(isValid) {
        	System.out.println("Valid");
        }
        else {
        	System.out.println("Name Not Valid\n"
        			+ "First name starts with Cap and has minimum 3 characters\r\n");
        }
        
        
        scanner.close();
    }
}
