package util;

import java.util.List;

import domain.Admin;

public class InMemoryAdminList extends InMemoryList<Admin>{

	private InMemoryAdminList(List<Admin> listaAdmina) {
		super(listaAdmina);
	}
	
	public static InMemoryAdminList newInMemoryAdminList(List<Admin> listaAdmina) {
		return new InMemoryAdminList(listaAdmina);
	}

	@Override
	public List<Admin> inMemoryList() {
		return super.lista;
	}
}