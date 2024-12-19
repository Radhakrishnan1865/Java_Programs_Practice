package string;

public class Remove_Spcial_Character {

	public static void main(String[] args) {
        String str = "dgjf58$%^#$fdjf574#&@*NREF&vdjfg$&543v4263ID4dh$%#$#^vdh4376fdg$$%^";
        
        // Strings to hold different categories of characters
        StringBuilder letters = new StringBuilder();
        StringBuilder numbers = new StringBuilder();
        StringBuilder specialCharacters = new StringBuilder();
        
        // Loop through each character in the string
        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                letters.append(c);
            } else if (Character.isDigit(c)) {
                numbers.append(c);
            } else if(!Character.isLetterOrDigit(c)) {
                specialCharacters.append(c);
            }
        }
        
        // Print results
        System.out.println("Letters: " + letters.toString());
        System.out.println("Numbers: " + numbers.toString());
        System.out.println("Special Characters: " + specialCharacters.toString());
    }
}
