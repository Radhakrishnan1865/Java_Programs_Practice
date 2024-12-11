package string;

public class StringA {

	public static void main(String[] args) {
		
		String str="Welcome to sunday";
		String[] s=str.split(" ");
		
		StringBuilder sb= new StringBuilder();
		
		for(String word:s) {
			
			sb.append(new StringBuilder(word).reverse().toString()).append(" ");
		}
		System.out.println("Reversed String: "+ sb.toString().trim());
	}
}
