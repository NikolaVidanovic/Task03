package domain;

public class BasicKorisnik extends Korisnik{

	
	
	private BasicKorisnik(String ime, String prezime, String username, String password) {
		super(ime, prezime, username, password);
	}
	
	public static BasicKorisnik newBasicKorisnik(String ime, String prezime, String username, String password) {
		return new BasicKorisnik(ime,prezime,username,password);
	}

	@Override
	public String toString() {
		return "BasicKorisnik [getIme()=" + getIme() + ", getPrezime()=" + getPrezime() + ", getUsername()=" + getUsername() ;
	}
}
