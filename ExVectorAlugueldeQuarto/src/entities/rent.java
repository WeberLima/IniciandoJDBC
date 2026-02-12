package entities;

public class rent {
	private String name;
	private String email;

	public rent() {}

	public rent(String name, String email) {
	
		this.name = name;
		this.email = email;
	}

	@Override
	public String toString() {
		return name + ", " + email;
	}
	
	
}

