package app.domain.services;

import app.domain.model.User;
import app.domain.ports.UserPort;

public class UserService {
	public UserPort userPort;
	
	public void createUser(User user) throws Exception {
		
	if (userPort.findByDocumet(user)!=null) {
		 throw new Exception ("ya existe una persona con esa cedula") ;
	}
	if (userPort.findByUserName(user)!=null) {
		 throw new Exception ("ya existe una persona con este nombre de usuario");
	}
	userPort.save(user);
		
	}

}
