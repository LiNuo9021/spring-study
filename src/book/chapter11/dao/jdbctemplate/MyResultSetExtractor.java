package book.chapter11.dao.jdbctemplate;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

public class MyResultSetExtractor<T> implements ResultSetExtractor<Set<T>> {
	private MyResultSetHandler<T> handler;
	
	public MyResultSetExtractor(MyResultSetHandler<T> handler) {
		this.handler = handler;
	}
	
	@Override
	public Set<T> extractData(ResultSet rs) throws SQLException, DataAccessException {
		Set<T> set = new HashSet<T>();
		while(rs.next()){
			set.add(handler.handlerResultSet(rs));
		}
		return set;
	}
}
