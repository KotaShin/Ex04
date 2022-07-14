import java.util.Random;
    
class Main {
    public static void main(String[] args) {
	Random r = new Random();
	Coin c = new Coin();

	System.out.println("Tossing...");
	for(int i = 1; i <= 3; i++) {
	    int x = r.nextInt(2);
	    System.out.print("Round "+i+": ");
	    c.tos(x);
	}

	c.status();
	c.judge();
    }
}
