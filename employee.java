public class Employee extends User {
    private String accessLevel;

    public Employee(String userID, String name, String email, String password, String accessLevel) {
        super(userID, name, email, password);
        this.accessLevel = accessLevel;
    }

    // Getter and Setter for accessLevel
    public String getAccessLevel() { return accessLevel; }
    public void setAccessLevel(String accessLevel) { this.accessLevel = accessLevel; }

    @Override
    public void updateProfile() {
        // Implementation
    }

    @Override
    public void login() {
        // Implementation
    }

    @Override
    public void logout() {
        // Implementation
    }

    @Override
    public void accessProject() {
        // Implementation
    }

    public void updateContent() {
        // Implementation
    }

    public void earnBeenz() {
        // Implementation
    }

    public void searchEmployee() {
        // Implementation
    }

    public void editDocument() {
        // Implementation
    }

    public void submitDocument() {
        // Implementation
    }
}
