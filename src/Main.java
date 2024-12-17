import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Welcome to User Registration System which ensures all validations are in place during a User Entry.");
    	Scanner scanner = new Scanner(System.in);

        User user = new User();
        //Input First name
//        while(true) {
//        	System.out.print("Enter First Name: ");
//            String inputFirstName = scanner.nextLine();
//
//            boolean isValid = user.validateFirstName(inputFirstName);
//            if(!isValid) {
//            	System.out.println("Not Valid\n"
//            			+ "First name starts with Cap and has minimum 3 characters\r\n");
//            }
//            else {//set the first name once it is validated
//            	user.setFirstName(inputFirstName);
//            	break;
//            }    	
//        }
//        //Input last name
//        while(true) {
//        	System.out.print("Enter Last Name: ");
//            String inputLastName = scanner.nextLine();
//
//            boolean isValid = user.validateLastName(inputLastName);
//            if(!isValid) {
//            	System.out.println("Not Valid\n"
//            			+ "Last name starts with Cap and has minimum 3 characters\r\n");
//            }
//            else {
//            	user.setLastName(inputLastName);
//            	break;
//            }
//        }
//        //Input email
//        while(true) {
//        	System.out.print("Enter Email: ");
//            String inputEmail = scanner.nextLine();
//
//            boolean isValid = user.validateEmail(inputEmail);
//            if(!isValid) {
//            	System.out.println("Email Not Valid\n");
//            }
//            else {//set the email once it is validated
//            	user.setEmail(inputEmail);
//            	break;
//            }
//        }
//        //Input Mobile
//        while (true) {
//            System.out.print("Enter Mobile Number: ");
//            String phone = scanner.nextLine();
//
//            boolean isValid = user.validateMobileNumber(phone);
//
//            if (isValid) {
//            	//System.out.print("Valid");
//            	user.setPhone(phone);
//                break; 
//            } else {
//                System.out.println("Invalid Mobile Number.\nCountry code follow by space and 10 digit number");
//            }
//        }
//        // Input Password RULE 1,RULE 2,RULE 3, RULE 4
//        while (true) {
//            System.out.print("Enter Password : ");
//            String inputPassword = scanner.nextLine();
//            boolean isValid = user.validatePassword(inputPassword);
//
//            if (isValid) {
//            	System.out.print("Valid");
//            	user.setPassword(inputPassword);
//                break; 
//            } else {
//                System.out.println("Invalid Password. Must be at least 8 characters long, "
//                		+ "at least 1 Upper Case, atleast a numeric char and a special character");
//            }
//        }
        ArrayList<String> inputs = new ArrayList<>();
        while(true) {
        	System.out.print("Provide email samples: ");
            String inputEmail = scanner.nextLine();
            System.out.print("Enter n to exit: ");
           
            if(inputEmail.contentEquals("n")){
            	break;
            }
            inputs.add(inputEmail);
        }
        String[] emails=inputs.toArray(new String[0]);
		user.validateMultipleEmails(emails);
        
        scanner.close();
          
        
    }
}
