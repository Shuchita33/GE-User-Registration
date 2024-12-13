public class User {
    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean validateFirstName() {
        String firstNamePattern = "^[A-Z][a-zA-Z]{2,}$";
        return this.firstName.matches(firstNamePattern);
    }
    public boolean validateLastName() {
        String lastNamePattern = "^[A-Z][a-zA-Z]{2,}$";
        return this.lastName.matches(lastNamePattern);
    }
}
