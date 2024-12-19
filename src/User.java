public class User {
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String password;

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getEmail() {
        return email;
    }
    public String getPhone() {
        return phoneNumber;
    }
    public String getPassword() {
        return password;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPhone(String phone) {
        this.phoneNumber = phone;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public void validateFirstName(String firstName) throws UserException {
        String firstNamePattern = "^[A-Z][a-zA-Z]{2,}$";
        if(!firstName.matches(firstNamePattern)){
        	throw new UserException("Not Valid,First name starts with Cap and has minimum 3 characters");
        }
    }
    public void validateLastName(String lastName) throws UserException {
        String lastNamePattern = "^[A-Z][a-zA-Z]{2,}$";
        if(!lastName.matches(lastNamePattern)) {
        	throw new UserException("Not Valid,Last name starts with Cap and has minimum 3 characters");
        };
    }
    public void validateEmail(String email) throws UserException {
        String emailPattern = "^[a-zA-Z0-9_+&*-.]+@[a-zA-Z0-9]+\\.[a-zA-Z]{2,}$";
        if(!email.matches(emailPattern)) {
        	throw new UserException("Email Not Valid,");
        };
    }
    public void validateMobileNumber(String phone) throws UserException {
        String numberPattern = "^[0-9]{2} [0-9]{10}$";
        if(!phone.matches(numberPattern)) {
        	throw new UserException("Invalid Mobile Number. Country code follow by space and 10 digit number");
        };
    }
//    public boolean validatePassword(String password) {
//        return password.length() >= 8;
//    }
	public void validatePassword(String password) throws UserException {
//      String passwordPattern = "^(?=.*[A-Z]).{8,}$";
//		String passwordPattern = "^(?=.*[A-Z])(?=.*\\d).{8,}$";
		String passwordPattern = "^(?=.{8,})(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).*$";
	  if(!password.matches(passwordPattern)) {
		  throw new UserException("Invalid Password. Must be at least 8 characters long, at least 1 Upper Case, atleast a numeric char and a special character");
	  };
	}
	public void validateMultipleEmails(String[] emails) {
	    System.out.println("Validating Email Samples:");
	    for (String email : emails) {
	    	try {
	    		validateEmail(email);
		        System.out.println(email + " -- Valid");
	    	}
	    	catch(UserException e){
                System.out.println(email + " -- "+ e.getMessage());
	    	}
	        
	    }
	}
     
}
