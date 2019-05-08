package com.revature.bean;

public class ErsReimbursementType {
	
	private int REIMB_TYPE_ID;
	private String REIMB_TYPE;
	public int getREIMB_TYPE_ID() {
		return REIMB_TYPE_ID;
	}
	public void setREIMB_TYPE_ID(int rEIMB_TYPE_ID) {
		REIMB_TYPE_ID = rEIMB_TYPE_ID;
	}
	public String getREIMB_TYPE() {
		return REIMB_TYPE;
	}
	public void setREIMB_TYPE(String rEIMB_TYPE) {
		REIMB_TYPE = rEIMB_TYPE;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((REIMB_TYPE == null) ? 0 : REIMB_TYPE.hashCode());
		result = prime * result + REIMB_TYPE_ID;
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
		ErsReimbursementType other = (ErsReimbursementType) obj;
		if (REIMB_TYPE == null) {
			if (other.REIMB_TYPE != null)
				return false;
		} else if (!REIMB_TYPE.equals(other.REIMB_TYPE))
			return false;
		if (REIMB_TYPE_ID != other.REIMB_TYPE_ID)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "ErsReimbursementType [REIMB_TYPE_ID=" + REIMB_TYPE_ID + ", REIMB_TYPE=" + REIMB_TYPE + "]";
	}
	public ErsReimbursementType(int rEIMB_TYPE_ID, String rEIMB_TYPE) {
		super();
		REIMB_TYPE_ID = rEIMB_TYPE_ID;
		REIMB_TYPE = rEIMB_TYPE;
	}
	public ErsReimbursementType() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
