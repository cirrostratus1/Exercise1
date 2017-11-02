import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		HelloUser user = null;
		System.out.println("Hello ASE2017 - How are you? :)");
		
		System.out.print("Please enter your name: ");
		Scanner in = new Scanner(System.in);
		user = new HelloUser(in.nextLine());
		
		user.greetUser();
		
		in.close();
	}

}
