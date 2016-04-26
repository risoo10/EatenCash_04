package models;

import java.io.*;
import java.util.*;


public class Users implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// typy pouzivatelov 
	public static String[] userTyp = { "User", "Rodic", "Master" }; // 3 typy
	
	private List<User> users = new ArrayList<User>();
	
	public List<User> getUsers(){
		return users;
	}
	
	public void setUsers(List<User> newUsers){
		users = newUsers;
	}
	
	public void addUser(User u){
		users.add(u);
	}
	
	public User getUser(int index){
		return users.get(index);
	}
	
	
	
	
}