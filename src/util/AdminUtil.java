package util;

import java.util.List;

import domain.Admin;
import domain.Role;

public class AdminUtil {

	public static boolean ifExist(String userName , String passWord , List<Admin> list) {
		for(Admin a : list) {
			if (a.getUsername().equals(userName) && a.getPassword().equals(passWord) && a.getRole().value().equals(Role.ADMIN.role))
					return true;
		}
		return false;
	}
	
	
}
