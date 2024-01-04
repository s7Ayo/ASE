package demo.src.main.java.com.example;
import path.to.Biography; // Replace 'path.to' with the actual package path


public class Employee extends User {
    private String accessLevel;
    private BeenzAccount beenzAccount; // Ensure this matches the class name
    private Biography biography; // Composition of Biography


    // Constructor including Biography
    public Employee(String userID, String name, String email, String password, String accessLevel, int biographyID) {
        super(userID, name, email, password);
        this.accessLevel = accessLevel;
        this.beenzAccount = new BeenzAccount(); // Correct initialization
        this.biography = new Biography(biographyID, userID); // Initialize Biography
    }

    // Getters and setters for accessLevel, beenzAccount, and biography
    public String getAccessLevel() {
        return accessLevel;
    }

    public void setAccessLevel(String accessLevel) {
        this.accessLevel = accessLevel;
    }

    public BeenzAccount getBeenzAccount() {
        return beenzAccount;
    }

    public Biography getBiography() {
        return biography;
    }

    // Implementations of abstract methods from User class
    @Override
    public void updateProfile() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void login() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void logout() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void accessProject(String projectID) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    // Employee-specific methods
    public void updateContent() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void earnbeenz() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void searchEmployee() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void editDocument() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void submitDocument() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
