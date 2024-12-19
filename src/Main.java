import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        //System.out.println("Welcome to User Registration System which ensures all validations are in place during a User Entry.");
    	Scanner scanner = new Scanner(System.in);

        User user = new User();
        //Input First name
        while(true) {
        	System.out.print("Enter First Name: ");
            String inputFirstName = scanner.nextLine();

            try {
            	user.validateFirstName(inputFirstName);
            	user.setFirstName(inputFirstName);
            	break;

            }catch(UserException e) {
                System.out.println(e.getMessage());
            }
        }
        //Input last name
        while(true) {
        	System.out.print("Enter Last Name: ");
            String inputLastName = scanner.nextLine();

            try{
            	user.validateLastName(inputLastName);
            	user.setLastName(inputLastName);
            	break;
            }catch(UserException e) {
                System.out.println(e.getMessage());
            }
         }
        //Input email
        while(true) {
        	System.out.print("Enter Email: ");
            String inputEmail = scanner.nextLine();

            try{
            	user.validateEmail(inputEmail);
            	user.setEmail(inputEmail);
            	break;
            }catch(UserException e) {
                System.out.println(e.getMessage());;
            }

        }
        //Input Mobile
        while (true) {
            System.out.print("Enter Mobile Number: ");
            String phone = scanner.nextLine();

            try{
            	user.validateMobileNumber(phone);
            	user.setPhone(phone);
            	break;
            }catch(UserException e) {
                System.out.println(e.getMessage());;
            }

        }
        // Input Password RULE 1,RULE 2,RULE 3, RULE 4
        while (true) {
            System.out.print("Enter Password : ");
            String inputPassword = scanner.nextLine();
            try{
            	user.validatePassword(inputPassword);
            	user.setPassword(inputPassword);
            	break;
            }catch(UserException e) {
                System.out.println(e.getMessage());;
            }
        }

    //EMAIL SAMPLES
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

