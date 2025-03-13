package ntu.hongdta.service;

import org.springframework.stereotype.Service;

@Service
public class UserAccount {
	public boolean authenticate(String id, String pass) {
		return "admin".equals(id) && "123".equals(pass);
	}
}
