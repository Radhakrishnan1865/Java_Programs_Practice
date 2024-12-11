package string;

public class Find_Max_Min_Length {


	public static void main(String[] args) {
		
		//Approach 01- find length of word
		String str1="Welcome to my home";
		
		String[]words= str1.split(" ");

		String min=words[0];
		String max=words[0];
		for(String w:words) {
			
			if(w.length()<min.length()) {
				min=w;
			}
			 if(w.length()>max.length()) {
				max=w;
			}
			
		}
		System.out.println("minimum length word:" +min);//minimum length word:to
		System.out.println("maximum length word:" + max);//maximum length word:Welcome
		
		//Approach 02- find length of values
		String[] strings = {"Hello", "Hi", "Goodbye", "Welcome"};

        int maxLength = Integer.MIN_VALUE; // Initialize to smallest possible value
        int minLength = Integer.MAX_VALUE; // Initialize to largest possible value

        for (String str : strings) {
            int length = str.length();
            if (length > maxLength) {
                maxLength = length;
            }
            if (length < minLength) {
                minLength = length;
            }
        }

        System.out.println("Maximum Length value: " + maxLength);//Maximum Length value: 7
        System.out.println("Minimum Length value: " + minLength);//Minimum Length value: 2
	}
}
