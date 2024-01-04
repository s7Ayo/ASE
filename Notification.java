public class Notification {
    private String notificationID;
    private String content;

    // Constructor
    public Notification(String notificationID, String content) {
        this.notificationID = notificationID;
        this.content = content;
    }

    // Getters and Setters
    public String getNotificationID() {
        return notificationID;
    }

    public void setNotificationID(String notificationID) {
        this.notificationID = notificationID;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    // Method to send the notification
    public void sendNotification() {
        // Implementation for sending the notification
        // This could involve adding the notification to a queue, sending it over a network, etc.
        System.out.println("Sending notification: " + content);
    }

    // Override toString for better readability
    @Override
    public String toString() {
        return "Notification{" +
               "notificationID='" + notificationID + '\'' +
               ", content='" + content + '\'' +
               '}';
    }
}
