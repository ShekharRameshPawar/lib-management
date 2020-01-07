package com.lib.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DaoConnection implements DaoInterface {

	private Connection con;
	private Statement stmt;
	private ResultSet resultSet;

	public ResultSet excuteQueryCustom(String sql) throws Exception {
		createConnection();
		createStmt();
		this.resultSet= this.stmt.executeQuery(sql);
		return this.resultSet;

	}
	
	public int updateDataBaseOrInsertRow(String sql) throws Exception {
		createConnection();
		createStmt();
		int executeUpdate = this.stmt.executeUpdate(sql);
		return executeUpdate;
	}
	
	private void closeConnections() throws SQLException {
		this.resultSet.close();
		this.stmt.close();
		this.con.close();
	}

	private void createStmt() throws SQLException {
		this.stmt = this.con.createStatement();
	}
	
	private void createConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		this.con = DriverManager.getConnection("jdbc:mysql://localhost:3306/book", "root", "");
	}
}
