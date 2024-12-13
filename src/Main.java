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
        	System.out.print("Enter Last Name: ");
            String inputLastName = scanner.nextLine();

            user.setLastName(inputLastName);

            isValid = user.validateLastName();
            if(isValid) {
            	System.out.print("Valid");
            }
            else {
            	System.out.println("Not Valid\n"
        			+ "Last name starts with Cap and has minimum 3 characters\r\n");	
            }
        }
        else {
        	System.out.println("Not Valid\n"
        			+ "First name starts with Cap and has minimum 3 characters\r\n");
        }

        
        scanner.close();
    }
}
