package domain;

public abstract class Korisnik {

	private final String ime;
	private final String prezime;
	private final String username;
	private final String password;
	
	public Korisnik(String ime, String prezime, String username, String password) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.username = username;
		this.password = password;
	}

	@Override
	public String toString() {
		return "Korisnik [ime=" + ime + ", prezime=" + prezime + ", username=" + username + "]";
	}
	
}
