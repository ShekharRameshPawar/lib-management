package com.lib.dao;

import java.sql.ResultSet;

public interface DaoInterface {
	public ResultSet excuteQueryCustom(String sql) throws Exception;

	public int updateDataBaseOrInsertRow(String sql) throws Exception;
}
