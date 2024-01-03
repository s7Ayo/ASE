public abstract class User {
    protected String userID;
    protected String name;
    protected String email;
    protected String password;
    protected boolean isLoggedIn;

    public User(String userID, String name, String email, String password) {
        this.userID = userID;
        this.name = name;
        this.email = email;
        this.password = password;
        this.isLoggedIn = false;

    // Getters
    public String getUserID() { return userID; }
    public String getName() { return name; }
    public String getEmail() { return email; }
    public String getPassword() { return password; }

    // Setters
    public void setUserID(String userID) { this.userID = userID; }
    public void setName(String name) { this.name = name; }
    public void setEmail(String email) { this.email = email; }
    public void setPassword(String password) { this.password = password; }

    public abstract void updateProfile();
    public abstract void login(String password);
    public abstract void logout();
    public abstract void accessProject(String projectID);
}
