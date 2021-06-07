package demo;

public enum Suit {
	
	Clubs(4),
	Diamonds(3),
	Hearts(2),
	Spades(1);
	
	private int rank;

	private Suit(int rank) {
		this.rank = rank;
	}

	public int getRank() {
		return rank;
	}
	
}
