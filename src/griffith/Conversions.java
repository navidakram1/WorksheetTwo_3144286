package griffith;

public class Conversions {
    // Convert Euro to Dollar
    public double euroToDollar(double euro) {
        return euro * 1.18; // Assuming 1 Euro = 1.18 Dollars
    }

    // Convert Dollar to Euro
    public double dollarToEuro(double dollar) {
        return dollar / 1.18; // Assuming 1 Euro = 1.18 Dollars
    }

    // Convert String to Integer
    public int stringToInteger(String val) {
        try {
            return Integer.parseInt(val);
        } catch (NumberFormatException e) {
            return 0; // Return 0 for invalid input
        }
    }

    // Convert Integer to String
    public String integerToString(int val) {
        return String.valueOf(val);
    }

    // Switch case of a string (uppercase to lowercase and vice versa)
    public String switchCase(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }
        
        StringBuilder result = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (Character.isUpperCase(c)) {
                result.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                result.append(Character.toUpperCase(c));
            } else {
                result.append(c); // Keep non-letter characters unchanged
            }
        }
        return result.toString();
    }
}