package string;

public class Vowels_Print {

	public static void main(String[] args) {
		 
        String str="Radhakrishnan";
        String s=str.toLowerCase();
       String vowels="";
       String consonants="";
       // char[]ch={'a','e','i','o','u'};
        for(int i=0; i<s.length(); i++){
            char c=s.charAt(i);
           // for(char a:ch){
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                
               vowels+=c+",";
            }
            else
           
           consonants+=c+",";
        }
        System.out.println(vowels);
        System.out.println(consonants);
        }
       
       
    }

	

