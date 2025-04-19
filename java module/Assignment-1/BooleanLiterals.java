//7. Write a program that uses boolean literals to control program flow in an if-else statement.

public class BooleanLiterals{
	public static void main(String args[]){
		//boolean literals
		boolean isJavaFun=true;
		boolean isRaining=false;
		
		//using boolean literals in if-else conditions
		if(isJavaFun){
			System.out.println("Java is fun to learn");
		}else{
			System.out.println("Java is not fun to learn");
		}
		
		if(isRaining){
            System.out.println("Take an umbrella!");
        } else {
            System.out.println("Enjoy the sunny weather!");
        }
		
		//Direct use of boolean literals
		if(true){
			System.out.println("TRUE");
		}
		if(false){
			System.out.println("this will never Execute");
		}else{
			System.out.println("since false was used, this block execute instead.");
		}
	}
}