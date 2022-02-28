package repository;

import java.util.List;

import domain.BasicKorisnik;
import util.InMemoryBasicKorisnikList;
import util.InMemoryList;

public class BasicKorisnikRepoImpl implements CrudRepository<BasicKorisnik,String>{

	private InMemoryList<BasicKorisnik> lista;
	
	public BasicKorisnikRepoImpl(List<BasicKorisnik> lista) {
		this.lista = InMemoryBasicKorisnikList.newInMemoryBasicKorisnikList(lista);
	}
	

	@Override
	public List<BasicKorisnik> getAll() {
		return lista.inMemoryList();
	}

	@Override
	public BasicKorisnik getByUsername(String username) {
		for(BasicKorisnik b : lista.inMemoryList()) {
			if(b.getUsername().equalsIgnoreCase(username))
				return b;
		}
		return null;
	}

	@Override
	public BasicKorisnik updateKorisnik(BasicKorisnik e) {
		for(BasicKorisnik b : lista.inMemoryList()) {
			if(b.getUsername().equalsIgnoreCase(e.getUsername())) {
				b.setIme(e.getIme());
				b.setPrezime(e.getPrezime());
				b.setUsername(e.getUsername());
				b.setPassword(e.getPassword());
				
				return b;
			}
		}
		return null;
	}

	@Override
	public BasicKorisnik deleteKorisnik(BasicKorisnik e) {
		for(BasicKorisnik b : lista.inMemoryList()) {
			if(b.getUsername().equalsIgnoreCase(e.getUsername())){
				lista.inMemoryList().remove(b);
				return b;
			}
		}
		return null;
	}

	@Override
	public BasicKorisnik addKorisnik(BasicKorisnik e) {
		lista.inMemoryList().add(e);
		return e;
	}

}
