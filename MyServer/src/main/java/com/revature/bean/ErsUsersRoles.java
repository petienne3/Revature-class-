package com.revature.bean;

public class ErsUsersRoles {
	
	private int ERS_USERS_ROLE_ID;
	private String USER_ROLE;
	public int getERS_USERS_ROLE_ID() {
		return ERS_USERS_ROLE_ID;
	}
	public void setERS_USERS_ROLE_ID(int eRS_USERS_ROLE_ID) {
		ERS_USERS_ROLE_ID = eRS_USERS_ROLE_ID;
	}
	public String getUSER_ROLE() {
		return USER_ROLE;
	}
	public void setUSER_ROLE(String uSER_ROLE) {
		USER_ROLE = uSER_ROLE;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ERS_USERS_ROLE_ID;
		result = prime * result + ((USER_ROLE == null) ? 0 : USER_ROLE.hashCode());
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
		ErsUsersRoles other = (ErsUsersRoles) obj;
		if (ERS_USERS_ROLE_ID != other.ERS_USERS_ROLE_ID)
			return false;
		if (USER_ROLE == null) {
			if (other.USER_ROLE != null)
				return false;
		} else if (!USER_ROLE.equals(other.USER_ROLE))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "ErsUsersRoles [ERS_USERS_ROLE_ID=" + ERS_USERS_ROLE_ID + ", USER_ROLE=" + USER_ROLE + "]";
	}
	public ErsUsersRoles(int eRS_USERS_ROLE_ID, String uSER_ROLE) {
		super();
		ERS_USERS_ROLE_ID = eRS_USERS_ROLE_ID;
		USER_ROLE = uSER_ROLE;
	}
	public ErsUsersRoles() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
