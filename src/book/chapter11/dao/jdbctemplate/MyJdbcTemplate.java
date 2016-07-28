package book.chapter11.dao.jdbctemplate;

import java.util.Set;

import javax.sql.DataSource;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;

public class MyJdbcTemplate extends JdbcTemplate{
	public MyJdbcTemplate(DataSource dataSource) {
		super(dataSource);
	}
	
	public <T> Set<T> query(String sql, MyResultSetHandler<T> handler) throws DataAccessException {
		return super.query(sql, new MyResultSetExtractor<T>(handler));
	}
}
