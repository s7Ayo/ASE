package demo.src.main.java.com.example;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class Project {
    private String projectID;
    private String name;
    private String description;
    private String clientID;
    private LocalDateTime lastUpdated;
    private Map<String, Document> documents;

   

    public Project(String projectID, String name, String description, String clientID) {
        this.projectID = projectID;
        this.name = name;
        this.description = description;
        this.clientID = clientID;
        this.lastUpdated = LocalDateTime.now();
        this.documents = new HashMap<>();
        
    }

    // Getters and setters
    public String getProjectID() {
        return projectID;
    }

    public void setProjectID(String projectID) {
        this.projectID = projectID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getClientID() {
        return clientID;
    }

    public void setClientID(String clientID) {
        this.clientID = clientID;
    }

    public LocalDateTime getLastUpdated() {
        return lastUpdated;
    }

   

    // Existing methods...
}
