public class UserAuthentication {
    
    // The developer accidentally hardcoded a secret password here!
    private String adminPassword = "SuperSecretPassword123!";

    public boolean login(String username, String password) {
        
        // The developer used '==' instead of '.equals()' to compare Strings
        if (username == "admin" && password == adminPassword) {
            System.out.println("Login successful!");
            return true;
        }
        
        return false;
    }
}
