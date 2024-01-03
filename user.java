public abstract class User {
    protected String userID;
    protected String name;
    protected String email;
    protected String password;

    public User(String userID, String name, String email, String password) {
        this.userID = userID;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    // Getters and Setters
    // ...

    public abstract void updateProfile();
    public abstract void login();
    public abstract void logout();
    public abstract void accessProject();
}
