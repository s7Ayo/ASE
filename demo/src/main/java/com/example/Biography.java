package demo.src.main.java.com.example;
import java.time.LocalDateTime;

import java.time.LocalDateTime;

public class Biography {
    private int biographyID;
    private String userID;
    private String content;
    private LocalDateTime lastUpdated;

    public Biography(int biographyID, String userID) {
        this.biographyID = biographyID;
        this.userID = userID;
        this.content = ""; // Default content
        this.lastUpdated = LocalDateTime.now();
    }

    // Getters and setters
    // ...

    // Methods like createBiography, editBiography, etc.
    // ...


    // Create a new biography
    public void createBiography(String content) {
        this.content = content;
        updateLastUpdated();
    }

    // Edit the existing biography
    public void editBiography(String newContent) {
        this.content = newContent;
        updateLastUpdated();
    }

    // Delete the biography content
    public void deleteBiography() {
        this.content = "";
        updateLastUpdated();
    }

    // Get the biography content
    public String getBiography() {
        return content;
    }

    // Set new content for the biography
    public void setBiography(String content) {
        this.content = content;
        updateLastUpdated();
    }

    // Get the last updated time
    public LocalDateTime getLastUpdated() {
        return lastUpdated;
    }

    // Update the last updated time
    private void updateLastUpdated() {
        this.lastUpdated = LocalDateTime.now();
    }
}



