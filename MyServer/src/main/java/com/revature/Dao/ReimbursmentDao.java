package com.revature.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.revature.Util.ConnectionUtil;
import com.revature.bean.ErsReimbursement;

public class ReimbursmentDao {
	
	private static java.sql.Timestamp getCurrentTimeStamp(){
		
		java.util.Date today = new java.util.Date();
		return new java.sql.Timestamp(today.getTime());
	}
	
	public boolean Reimbursment(ErsReimbursement reimbursed) {
		
		try(Connection conn = ConnectionUtil.getConnection()){
		String sql = "Insert into ers reimbursment (REIM_ID, REIM_AMMOUNT, REIMB_DESCRIPTION, REIMB_AUTHOR, REIMB_RESOLVER, REIMB_STATUS_ID, REIMB_TYPE) values (?,?,?,?,?,?,?,?,)";
		PreparedStatement ps = conn.prepareStatement(sql);
		
		ps.setInt(1, reimbursed.getId());
		ps.setDouble(2, reimbursed.getAmount());
		ps.setString(3, reimbursed.getDescription());
		
		
		}
	}

}
