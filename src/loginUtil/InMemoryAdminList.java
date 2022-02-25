package loginUtil;

import java.util.List;

import domain.Admin;

public class InMemoryAdminList {
	
	private List<Admin> listaAdmina;

	private InMemoryAdminList(List<Admin> listaAdmina) {
		super();
		this.listaAdmina = listaAdmina;
	}
	
	public static InMemoryAdminList newAdminList(List<Admin> listaAdmina) {
		return new InMemoryAdminList(listaAdmina);
	}
	
	public List<Admin> getAdminList(){
		return listaAdmina;
	}

}
