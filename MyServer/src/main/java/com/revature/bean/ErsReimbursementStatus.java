package com.revature.bean;

public class ErsReimbursementStatus {
	
	private int REIMB_STATUS_ID;
	private String REIMB_STATUS;
	
	
	public int getREIMB_STATUS_ID() {
		return REIMB_STATUS_ID;
	}
	public void setREIMB_STATUS_ID(int rEIMB_STATUS_ID) {
		REIMB_STATUS_ID = rEIMB_STATUS_ID;
	}
	public String getREIMB_STATUS() {
		return REIMB_STATUS;
	}
	public void setREIMB_STATUS(String rEIMB_STATUS) {
		REIMB_STATUS = rEIMB_STATUS;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((REIMB_STATUS == null) ? 0 : REIMB_STATUS.hashCode());
		result = prime * result + REIMB_STATUS_ID;
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
		ErsReimbursementStatus other = (ErsReimbursementStatus) obj;
		if (REIMB_STATUS == null) {
			if (other.REIMB_STATUS != null)
				return false;
		} else if (!REIMB_STATUS.equals(other.REIMB_STATUS))
			return false;
		if (REIMB_STATUS_ID != other.REIMB_STATUS_ID)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "ErsReimbursementStatus [REIMB_STATUS_ID=" + REIMB_STATUS_ID + ", REIMB_STATUS=" + REIMB_STATUS + "]";
	}
	public ErsReimbursementStatus(int rEIMB_STATUS_ID, String rEIMB_STATUS) {
		super();
		REIMB_STATUS_ID = rEIMB_STATUS_ID;
		REIMB_STATUS = rEIMB_STATUS;
	}
	public ErsReimbursementStatus() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
