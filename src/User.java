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

    public boolean validateFirstName(String firstName) {
        String firstNamePattern = "^[A-Z][a-zA-Z]{2,}$";
        return firstName.matches(firstNamePattern);
    }
    public boolean validateLastName(String lastName) {
        String lastNamePattern = "^[A-Z][a-zA-Z]{2,}$";
        return lastName.matches(lastNamePattern);
    }
    public boolean validateEmail(String email) {
        String emailPattern = "^[a-zA-Z0-9_+&*-.]+@[a-zA-Z0-9]+\\.[a-zA-Z]{2,}$";
        return email.matches(emailPattern);
    }
    public boolean validateMobileNumber(String phone) {
        String numberPattern = "^[0-9]{2} [0-9]{10}$";
        return phone.matches(numberPattern);
    }
    public boolean validatePassword(String password) {
        return password.length() >= 8;
    }
}
