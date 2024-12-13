public class User {
    private String firstName;
    private String lastName;
    private String email;

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getEmail() {
        return email;
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

    public boolean validateFirstName() {
        String firstNamePattern = "^[A-Z][a-zA-Z]{2,}$";
        return this.firstName.matches(firstNamePattern);
    }
    public boolean validateLastName() {
        String lastNamePattern = "^[A-Z][a-zA-Z]{2,}$";
        return this.lastName.matches(lastNamePattern);
    }
    public boolean validateEmail() {
        String emailPattern = "^[a-zA-Z0-9_+&*-.]+@[a-zA-Z0-9]+\\.[a-zA-Z]{2,}$";
        return this.email.matches(emailPattern);
    }
}
