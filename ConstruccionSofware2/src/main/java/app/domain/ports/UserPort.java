package app.domain.ports;

import app.domain.model.User;

public interface UserPort {
	public User findByDocumet(User user) throws Exception;
	public User findByUserName(User user) throws Exception;
	public void save(User user) throws Exception;

}
