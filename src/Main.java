import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Welcome to User Registration System which ensures all validations are in place during a User Entry.");
    	Scanner scanner = new Scanner(System.in);

        User user = new User();
        //Input First name
        while(true) {
        	System.out.print("Enter First Name: ");
            String inputFirstName = scanner.nextLine();

            user.setFirstName(inputFirstName);

            boolean isValid = user.validateFirstName();
            if(!isValid) {
            	System.out.println("Not Valid\n"
            			+ "First name starts with Cap and has minimum 3 characters\r\n");
            }
            else {
            	break;
            }    	
        }
        //Input last name
        while(true) {
        	System.out.print("Enter Last Name: ");
            String inputLastName = scanner.nextLine();

            user.setLastName(inputLastName);

            boolean isValid = user.validateLastName();
            if(!isValid) {
            	System.out.println("Not Valid\n"
            			+ "Last name starts with Cap and has minimum 3 characters\r\n");
            }
            else {
            	break;
            }
        }
        //Input email
        while(true) {
        	System.out.print("Enter Email: ");
            String inputEmail = scanner.nextLine();

            user.setEmail(inputEmail);

            boolean isValid = user.validateEmail();
            if(!isValid) {
            	System.out.println("Email Not Valid\n");
            }
            else {
            	System.out.print("Valid");
            	break;
            }
        }
        
        scanner.close();
          
        
    }
}
