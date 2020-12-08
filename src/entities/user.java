package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class user {
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");

	private String username;
	private Date log;

	public user() {
	}
	public user(String username, Date log) {
		this.username = username;
		this.log = log;
	}
	public String getUsername() {
		return username;
	}
	public Date getLog() {
		return log;
	}
	public String toString() {
		return username + " " + sdf.format(log);
	}/*
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((username == null) ? 0 : username.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		user other = (user) obj;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}*/
	
}
