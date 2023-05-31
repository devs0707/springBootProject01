package com.devs.rest.webservices.restfulwebservices.user;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {

	private static List<User> users = new ArrayList<>();
	
	private static int userCount = 0;
	
	static {
		users.add(new User(++userCount, "Dev", LocalDate.now().minusYears(22)));
		users.add(new User(++userCount, "Abhi", LocalDate.now().minusYears(20)));
		users.add(new User(++userCount, "Fenny", LocalDate.now().minusYears(5)));
	}
	
	public List<User> findAll(){
		return users;
	}
	
	public User findUserById(Integer id){
		Predicate<? super User> predicate = 
				user -> user.getId().equals(id);
		return users.stream().filter(predicate).findFirst().orElse(null);
	}
	
	public User save(User user) {
		user.setId(++userCount);
		users.add(user);
		return user;
	}
	
	public void deleteById(Integer id){
		Predicate<? super User> predicate = 
				user -> user.getId().equals(id);
		users.removeIf(predicate);
	}
}
