package demo;

public class TryFeatureSwitch {

	// Supported types char, byte, short, int, Character, Byte, Short, Integer, String, or an enum type
	public static void main(String[] args) {
		
		tryTraditionalSwitchStmtThatPrints();
		
		tryTraditionalSwitchStmt();
		
		tryNewSwitchExpression();
		
		tryNewSwitchExpressionWithDefault();
		
		trySwitchStmtOnByte();
		
		trySwitchStmtOnShort();
		
		trySwitchStmtOnInteger();
		
		trySwitchStmtOnCharacter();
		
		trySwitchStmtOnString();
		
		trySwitchStmtOnEnum();
		
		trySwitchStmtWithCommmaOnEnum();
		
		trySwitchExprOnEnum();
		
		trySwitchExprWithCommaOnEnum();
		
		trySwitchExprYield();
		
		trySwitchExprUsingColonWithYield(Season.Spring);

	}
	
	private static void tryTraditionalSwitchStmtThatPrints() {
		
		Suit suit = Suit.Diamonds;
		switch (suit) {
			case Spades : System.out.println("♠"); break;
			case Hearts : System.out.println("♥"); break;
			case Diamonds : System.out.println("◆"); break;
			case Clubs : System.out.println("♣"); break;
		}

	}
	
	private static void tryTraditionalSwitchStmt() {
		
		Suit suit = Suit.Diamonds;
		String display = null;
		switch (suit) {
			case Spades : display = "♠"; break;
			case Hearts : display = "♥"; break;
			case Diamonds : display = "◆"; break;
			case Clubs : display = "♣"; break;
		}
		System.out.println(display);
	}
	
	private static void tryNewSwitchExpression() {
		
		Suit suit = Suit.Diamonds;
		String display = switch (suit) {
			case Spades -> "♠";
			case Hearts -> "♥";
			case Diamonds -> "◆";
			case Clubs -> "♣";
		};
		System.out.println(display);
	}
	
	private static void tryNewSwitchExpressionWithDefault() {
		
		Suit suit = Suit.Diamonds;
		String display = switch (suit) {
			case Spades -> "♠";
			case Hearts -> "♥";
			default -> throw new IllegalArgumentException();
		};
		System.out.println(display);
	}
	
	
	private static void trySwitchStmtOnByte() {
		byte primitive = 5;
		switch(primitive) {
			case 2 : System.out.println(primitive * 2); break;
			case 5 : System.out.println(primitive * 3); break;
			case 7 : System.out.println(primitive * 4); break;
			case 9 : System.out.println(primitive * 5); break;
		}
		Byte value = primitive;
		switch(value) {
			case 2 : System.out.println(value * 2); break;
			case 5 : System.out.println(value * 3); break;
			case 7 : System.out.println(value * 4); break;
			case 9 : System.out.println(value * 5); break;
		}
	}
	
	private static void trySwitchStmtOnShort() {
		short primitive = 5;
		switch(primitive) {
			case 2 : System.out.println(primitive * 2); break;
			case 5 : System.out.println(primitive * 3); break;
			case 7 : System.out.println(primitive * 4); break;
			case 9 : System.out.println(primitive * 5); break;
		}
		Short value = primitive;
		switch(value) {
			case 2 : System.out.println(value * 2); break;
			case 5 : System.out.println(value * 3); break;
			case 7 : System.out.println(value * 4); break;
			case 9 : System.out.println(value * 5); break;
		}
	}
	
	private static void trySwitchStmtOnInteger() {
		int primitive = 5;
		switch(primitive) {
			case 2 : System.out.println(primitive * 2); break;
			case 5 : System.out.println(primitive * 3); break;
			case 7 : System.out.println(primitive * 4); break;
			case 9 : System.out.println(primitive * 5); break;
		}
		Integer value = primitive;
		switch(value) {
			case 2 : System.out.println(value * 2); break;
			case 5 : System.out.println(value * 3); break;
			case 7 : System.out.println(value * 4); break;
			case 9 : System.out.println(value * 5); break;
		}
	}
	
	private static void trySwitchStmtOnCharacter() {
		char primitive = 'C';
		switch(primitive) {
			case 'A' : System.out.println(primitive + '2'); break;
			case 'B' : System.out.println(primitive + '3'); break;
			case 'C' : System.out.println(primitive + '4'); break;
			case 'D' : System.out.println(primitive + '5'); break;
		}
		Character value = primitive;
		switch(value) {
			case 'A' : System.out.println(value  + '2'); break;
			case 'B' : System.out.println(value  + '3'); break;
			case 'C' : System.out.println(value  + '4'); break;
			case 'D' : System.out.println(value  + '5'); break;
		}
	}
	
	private static void trySwitchStmtOnString() {
		String value = "C";
		switch(value) {
			case "ABC" : System.out.println(value + "2"); break;
			case "B" : System.out.println(value + "3"); break;
			case "C" : System.out.println(value + "4"); break;
			case "XYZ" : System.out.println(value + "5"); break;
		}
	}
	
	private static void trySwitchStmtOnEnum() {
		Season season = Season.Spring;
		switch(season) {
			case Spring : // Will fallthrough
			case Summer : System.out.println("Spring/Summer"); break;
			case Autumn : 
			case Winter : System.out.println("Autumn/Winter"); break;
		}
	}
	
	private static void trySwitchStmtWithCommmaOnEnum() {
		Season season = Season.Spring;
		switch(season) {
			case Spring, Summer : System.out.println("Spring/Summer"); break;
			case Autumn, Winter : System.out.println("Autumn/Winter"); break;
		}
	}
	
	// A Switch expression should cover all possible values
	// There is no fall through
	// All expressions must be of the same type
	private static void trySwitchExprOnEnum() {
		Season season = Season.Spring;
		String value = switch(season) { // A Switch expression should cover all possible values
			case Spring -> "Spring/Summer";
			case Summer -> "Spring/Summer";
			case Autumn -> "Autumn/Winter";
			case Winter -> "Autumn/Winter";
		};
		System.out.println(value);
	}
	

	
	private static void trySwitchExprWithCommaOnEnum() {
		Season season = Season.Spring;
		String value = switch(season) {
			case Spring, Summer -> "Spring/Summer";
			case Autumn, Winter -> "Autumn/Winter";
		};
		System.out.println(value);
	}
	
	private static void trySwitchExprYield() {
		Season season = Season.Autumn;
		String value = switch(season) {
			case Spring -> "Spring!";
			default -> {
				String description = season.getDescription();
				yield description.toUpperCase();
			}
		};
		System.out.println(value);
	}
	
	// Mixing of different kinds of case statements '->' and  ':' is not allowed within a switch
	private static void trySwitchExprUsingColonWithYield(Season season) {
		String value = switch(season) {
			case Spring : yield "Spring!"; // Will not fall through
			case Summer : yield "Summer!";
			default : {
				String description = season.getDescription();
				yield description.toUpperCase();
			}
		};
		System.out.println(value);
	}
	
}
