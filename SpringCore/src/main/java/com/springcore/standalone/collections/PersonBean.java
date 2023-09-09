package com.springcore.standalone.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;

public class PersonBean {
	
	
	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}

	public Map<String, String> getRoles() {
		return roles;
	}

	public void setRoles(Map<String, String> roles) {
		this.roles = roles;
	}

	public Properties getProp() {
		return prop;
	}

	public void setProp(Properties prop) {
		this.prop = prop;
	}

	private List<String> friends;
	
	private Map<String,String> roles;
	
	private Properties prop;

	@Override
	public String toString() {
		return "PersonBean [friends=" + friends + ", roles=" + roles + ", prop=" + prop + "]";
	}
	

}
