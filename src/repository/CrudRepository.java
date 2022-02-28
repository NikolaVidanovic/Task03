package repository;

import java.util.List;

import domain.Korisnik;

public interface CrudRepository <E , T> {

	public E addKorisnik(E e);
	
	public List<E> getAll();
	
	public E getByUsername(String username);
	
	public E updateKorisnik(E e);
	
	public E deleteKorisnik(E e);
	
}
