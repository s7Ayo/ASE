public interface KMS {
    void registerEmployee(Employee employee);
    void assignProject(Employee employee, Project project);
    void updateProject(Project project);
    void sendNotification(String message, User user);
    void manageBeenz(Employee employee, int points);
    void requestEditDocument(Employee employee, Document document);
    void submitDocument(Employee employee, Document document);
    void updateContent(Employee employee, Document document, String newContent);
    Document viewDocument(String documentId);
    String documentDetails(Document document);
    void earnBeenz(Employee employee, int points);
    void editDocument(Employee employee, Document document, String newContent);
    Project accessProject(String projectId);
    String accessBiographies();
    Employee searchEmployee(String employeeId);
    void updateEmployeeProfile(Employee employee);
    void updateClientProfile(Client client);
    void login(User user, String password);
    void logout(User user);
}
