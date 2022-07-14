class Coin {
    int Heads = 0, Tails = 0;
    
    void tos(int s){
	if(s == 1) {
	    System.out.println("Heads");
	    Heads++;
	}
	else {
	    System.out.println("Tails");
	    Tails++;
	}
    }

    void status(){
	System.out.println("Heads: "+Heads+", Tails: "+Tails);
    }

    void judge(){
	if(Heads > Tails) System.out.println("You won");
	else System.out.println("You lost");
    }
	
}
