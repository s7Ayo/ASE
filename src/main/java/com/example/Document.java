package com.example;
import java.time.LocalDateTime;


    // ... rest of your code ...


public class Document {
    private String documentID;
    private String projectID;
    private String title;
    private String docContent;
    private LocalDateTime lastUpdated;

    // Constructor
    public Document(String documentID, String projectID, String title, String docContent) {
        this.documentID = documentID;
        this.projectID = projectID;
        this.title = title;
        this.docContent = docContent;
        this.lastUpdated = LocalDateTime.now();
    }

    // Getters and setters
    public String getDocumentID() {
        return documentID;
    }

    public void setDocumentID(String documentID) {
        this.documentID = documentID;
    }

    public String getProjectID() {
        return projectID;
    }

    public void setProjectID(String projectID) {
        this.projectID = projectID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDocContent() {
        return docContent;
    }

    public void setDocContent(String docContent) {
        this.docContent = docContent;
    }

    public LocalDateTime getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(LocalDateTime lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

        public void setContent(String newContent) {
            this.docContent = newContent;
            // Update lastUpdated or other relevant fields
        }
    
        // Existing methods...
    
    
    // Existing methods...
}
