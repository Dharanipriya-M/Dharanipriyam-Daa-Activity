public class CountTypes {
    public static void main(String[] args) {
        String str = "Java123@2024";
        int letters = 0, digits = 0, special = 0;
        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch)) letters++;
            else if (Character.isDigit(ch)) digits++;
            else special++;
        }
        System.out.println("Letters: " + letters + ", Digits: " + digits + ", Special: " + special);
    }
}
