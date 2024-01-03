public class Client extends User {
    private String companyName;
    private String companyInfo;

    public Client(String userID, String name, String email, String password, String companyName, String companyInfo) {
        super(userID, name, email, password);
        this.companyName = companyName;
        this.companyInfo = companyInfo;
    }

    // Getters and Setters for companyName and companyInfo
    public String getCompanyName() { return companyName; }
    public void setCompanyName(String companyName) { this.companyName = companyName; }
    public String getCompanyInfo() { return companyInfo; }
    public void setCompanyInfo(String companyInfo) { this.companyInfo = companyInfo; }

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

    public void accessBiographies() {
        // Implementation
    }
}
