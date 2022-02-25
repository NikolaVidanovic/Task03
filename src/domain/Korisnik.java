package domain;

public class Korisnik {

	private final String ime;
	private final String prezime;
	private final String username;
	private final String password;
	private final Role role;
	
	public static Korisnik newKorisnik(String ime, String prezime, String userName, String passWord, Role role) {
		return new Korisnik(ime,prezime,userName,passWord,role);
	}
	
	private Korisnik(String ime, String prezime, String username, String password, Role role) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.username = username;
		this.password = password;
		this.role = role;
	}
	
	public String getIme() {
		return ime;
	}
	public String getPrezime() {
		return prezime;
	}
	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}
	public Role getRole() {
		return role;
	}

	@Override
	public String toString() {
		return "Korisnik [ime=" + ime + ", prezime=" + prezime + ", username=" + username + ", role=" + role + "]";
	}
	
}
