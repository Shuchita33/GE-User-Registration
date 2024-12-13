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
            	break;
            }
        }
        //Input Mobile
        while (true) {
            System.out.print("Enter Mobile Number: ");
            String phone = scanner.nextLine();
            
            user.setPhone(phone);
            
            boolean isValid = user.validateMobileNumber();

            if (isValid) {
            	//System.out.print("Valid");
                break; 
            } else {
                System.out.println("Invalid Mobile Number.\nCountry code follow by space and 10 digit number");
            }
        }
        scanner.close();
          
        
    }
}
