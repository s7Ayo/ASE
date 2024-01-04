package demo.src.main.java.com.example;
public class BeenzAccount {
    private int beenzPoints;

    public BeenzAccount() {
        this.beenzPoints = 0; // Initially, the account has zero points.
    }

    // Getter and Setter for beenzPoints
    public int getBeenzPoints() {
        return beenzPoints;
    }

    public void setBeenzPoints(int beenzPoints) {
        if (beenzPoints >= 0) {
            this.beenzPoints = beenzPoints;
        } else {
            throw new IllegalArgumentException("Beenz points cannot be negative.");
        }
    }

    // Method to add beenz points
    public void addBeenz(int points) {
        if (points > 0) {
            this.beenzPoints += points;
            // Optionally, log this transaction or notify the user
        } else {
            throw new IllegalArgumentException("Cannot add negative points.");
        }
    }

    // Method to redeem beenz points
    public boolean redeemBeenz(int points) {
        if (points <= 0) {
            throw new IllegalArgumentException("Points to redeem must be positive.");
        }
        if (this.beenzPoints >= points) {
            this.beenzPoints -= points;
            // Optionally, log this transaction or notify the user
            return true; // Successfully redeemed
        }
        return false; // Not enough points to redeem
    }

    // Method to check current balance
    public int checkBalance() {
        return this.beenzPoints;
    }
}
