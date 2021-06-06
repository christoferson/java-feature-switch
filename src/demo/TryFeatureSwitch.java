package demo;

public class TryFeatureSwitch {

	public static void main(String[] args) {
		
		trySwitchStmtOnEnum();
		
		trySwitchStmtWithCommmaOnEnum();
		
		trySwitchExprOnEnum();
		
		trySwitchExprWithCommaOnEnum();
		
		trySwitchExprYield();
		
		trySwitchExprUsingColonWithYield(Season.Spring);
	
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
		String value = switch(season) {
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
