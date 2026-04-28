public class UserAuthentication {
    private String adminPassword = "SuperSecretPassword123!";
    public boolean login(String username, String password) {
        if (username == "admin" && password == adminPassword) {
            return true;
        }
        return false;
    }
}
