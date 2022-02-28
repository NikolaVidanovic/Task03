package util;

import java.util.List;

import domain.BasicKorisnik;

public class InMemoryBasicKorisnikList extends InMemoryList<BasicKorisnik>{

	protected InMemoryBasicKorisnikList(List<BasicKorisnik> list) {
		super(list);
	}
	
	public static InMemoryBasicKorisnikList newInMemoryBasicKorisnikList(List<BasicKorisnik> list){
		return new InMemoryBasicKorisnikList(list);
	}

	@Override
	public List<BasicKorisnik> inMemoryList() {
		return super.lista;
	}
	
	
	
}
