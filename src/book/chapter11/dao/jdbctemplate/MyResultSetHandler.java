package book.chapter11.dao.jdbctemplate;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface MyResultSetHandler<T> {
	public T handlerResultSet(ResultSet rs) throws SQLException;
}
