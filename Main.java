import java.util.Random;
import java.util.Scanner;
    
class Main2 {
    public static void main(String[] args) {
	String name;
	Random r = new Random();
	Coin c = new Coin();
	Scanner sc = new Scanner(System.in);

	System.out.println("Who are you?");
	System.out.print(">");
	name = sc.nextLine();
	System.out.println("Hello,"+name+"!");	
	
	System.out.println("Tossing a coin...");
	for(int i = 1; i <= 3; i++) {
	    int x = r.nextInt(2);
	    System.out.print("Round "+i+": ");
	    c.tos(x);
	}

	c.status();
    }
}
