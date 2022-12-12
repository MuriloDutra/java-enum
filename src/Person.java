
public enum Person {
	SINGLE("Solteiro"), MARRIED("Casado"), DIVORCED("Divorciado"), WIDOW("Viuvo");
	
	private String status;
	
	Person(String status) {
		this.status = status;
	}
	
	public String getStatus() {
		return this.status;
	}
}
