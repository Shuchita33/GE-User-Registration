public class User {
    private String firstName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public boolean validateFirstName() {
        String firstNamePattern = "^[A-Z][a-zA-Z]{2,}$";
        return this.firstName.matches(firstNamePattern);
    }
}
