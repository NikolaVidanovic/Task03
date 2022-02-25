package domain;

public enum Role {

	ADMIN("Admin"),
	EDITOR("Editor");
	
	public final String role;
	
	private Role(String role) {
		this.role = role;
	}
}
