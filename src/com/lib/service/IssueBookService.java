package com.lib.service;

import com.lib.classes.IssueBook;
import com.lib.dao.DaoConnection;
import com.lib.dao.DaoInterface;

public class IssueBookService implements IssueBookInterface {

	private DaoInterface dbConnection=new DaoConnection();
	
	@Override
	public Boolean bookAllocate(IssueBook issueBook) throws Exception {
		// TODO Auto-generated method stub

		StringBuffer sqlQuery=new StringBuffer();
		sqlQuery.append("INSERT INTO issuebook (bid) VALUES (")
//				.append(issueBook.getId())
//				.append(",")
				.append(issueBook.getBid().getId())
				.append(")");
		
		
	return	dbConnection.updateDataBaseOrInsertRow(sqlQuery.toString())==1?Boolean.TRUE:Boolean.FALSE;
		
		
	}

}
