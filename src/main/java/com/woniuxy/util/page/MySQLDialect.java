package com.woniuxy.util.page;

public class MySQLDialect implements Dialect {

	@Override
	public String getPageSql(String sql, int offset, int limit) {
		return sql + " limit " + offset + "," + limit;
	}

}
