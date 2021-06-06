package demo;

public enum Season {

	Spring("Trees start growing and flowers bloom."),
	Summer("Rrees have full green leaves and some bear fruit."),
	Autumn("Leaves turn orange and eventually fall."),
	Winter("Plants are dormant");
	
	private String description;
	
	private Season(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

}
