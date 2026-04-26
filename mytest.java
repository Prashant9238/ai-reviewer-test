public class UserPortal {
    
    // Test Case 1: Hardcoded sensitive information
    private String dbPassword = "Admin@Password123";

    public void processUser(String inputName) {
        
        // Test Case 2: Using == instead of .equals() for String comparison
        if (inputName == "Prashant") {
            System.out.println("Access Granted!");
        } else {
            System.out.println("Access Denied.");
        }
    }

    public int divideData(int a, int b) {
        // Test Case 3: Potential Division by Zero error
        return a / b;
    }
}
