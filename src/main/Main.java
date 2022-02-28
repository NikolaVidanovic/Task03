package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import domain.Admin;
import domain.BasicKorisnik;
import domain.Korisnik;
import domain.Role;
import repository.BasicKorisnikRepoImpl;
import util.AdminUtil;
import util.InMemoryAdminList;

public class Main {

	public static void main(String[] args) {

		Admin admin = Admin.newAdmin("Nino", "Vidanovic", "Nino", "Vidanovic", Role.ADMIN);

		List<Admin> inMemoryListaAdmina = Arrays.asList(admin);

		InMemoryAdminList listaAdmina = InMemoryAdminList.newInMemoryAdminList(inMemoryListaAdmina);

		Admin adminTest = Admin.newAdmin("Nino", "Vidanovic", "Nino", "Vidanovic", Role.ADMIN);

		Scanner sc = new Scanner(System.in);

		boolean succesfullyLoggedAdmin = false;

		while (!succesfullyLoggedAdmin) {
			System.out.println("Unesite svoj username i password.");
			String username = sc.nextLine();
			String password = sc.nextLine();
			if (AdminUtil.ifExist(username, password, listaAdmina.inMemoryList())) {
				System.out.println("Uspesno unesen admin");
				succesfullyLoggedAdmin = true;
			} else {
				System.out.println("Pokusajte ponovo");
			}
		}

		boolean flag = true;
		List<BasicKorisnik> listaKorisnika = new ArrayList<>();
		BasicKorisnikRepoImpl repo = new BasicKorisnikRepoImpl(listaKorisnika);

		while (flag) {

			System.out.println("Opcija 1 - Unos korisnika");
			System.out.println("Opcija 2 - Prikaz svih korisnika");
			System.out.println("Opcija 3 - Prikaz korisnika");
			System.out.println("Opcija 4 - Izmena korisnika");
			System.out.println("Opcija 5 - Brisanje korisnika");
			System.out.println("Opcija 0 - Izaci iz programa");

			int izbor = sc.nextInt();

			switch (izbor) {

			case 1:
				System.out.println("Unesite ime,prezime,username i password");
				String ime = sc.next();
				String prezime = sc.next();
				String username = sc.next();
				String password = sc.next();
				BasicKorisnik test = BasicKorisnik.newBasicKorisnik(ime, prezime, username, password);
				repo.addKorisnik(test);
				break;
			case 2:
				System.out.println(repo.getAll());
				break;
			case 3:
				String userName = sc.next();
				System.out.println(repo.getByUsername(userName));
				break;
			case 4:
				System.out.println("Unesite ime,prezime,username i password");
				String ime2 = sc.next();
				String prezime2 = sc.next();
				String username2 = sc.next();
				String password2 = sc.next();
				BasicKorisnik test2 = BasicKorisnik.newBasicKorisnik(ime2, prezime2, username2, password2);
				System.out.println(repo.updateKorisnik(test2));
				break;
			case 5:
				System.out.println("Unesite ime,prezime,username i password");
				String ime3 = sc.next();
				String prezime3 = sc.next();
				String username3 = sc.next();
				String password3 = sc.next();
				BasicKorisnik test3 = BasicKorisnik.newBasicKorisnik(ime3, prezime3, username3, password3);
				System.out.println(repo.deleteKorisnik(test3));
				break;
			case 0:
				flag = false;
				break;
			}
		}
		System.out.println("Dovidjenja.");
	}

}
