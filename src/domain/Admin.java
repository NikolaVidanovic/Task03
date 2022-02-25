package domain;

public class Admin extends Korisnik{

	private Role role;
	
	private Admin(String ime, String prezime, String username, String password, Role role) {
		super(ime, prezime, username, password);
		this.role = role;
	}

	public static Admin newAdmin(String ime, String prezime, String username, String password, Role role) {
		return new Admin(ime,prezime,username,password,role);
	}

	@Override
	public String toString() {
		return "Admin [role=" + role + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}	
	
	
}
