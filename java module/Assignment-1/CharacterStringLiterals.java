//6. Write a program to display character and string literals along with their ASCII values.

public class CharacterStringLiterals{
	public static void main(String args[]){
	
		//Character literals
		char c1='a',c2='z';
		
		char c3='5'; //numeric character
		char c4='@'; //Special character
		
		//ASCII values are displayed using typecasting:(int)char
		System.out.println(c1+ " ASCII value: "+(int)c1);
		System.out.println(c2+ " ASCII value: "+(int)c2);
		System.out.println(c3+ " ASCII value: "+(int)c3);
		System.out.println(c4+ " ASCII value: "+(int)c4);
		
		//String literals
		String str="Ashwin Ghute";
		for(int i=0;i<str.length();i++){
			char ch=str.charAt(i);
			System.out.println(ch+" ASCII value: "+(int)ch);
		}
		
	}
}