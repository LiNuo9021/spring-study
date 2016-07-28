package book.chapter11.dao.jdbctemplate;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.Set;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class JTBaseSample2 {
	public static void main(String[] args) {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setUrl("jdbc:mysql://114.215.97.155:3306/jf_dev_edc");
		ds.setUsername("jfdev");
		ds.setPassword("Egw4frZio643G354");

		JdbcTemplate jt = new JdbcTemplate(ds);


		// RowCallbackHandler映射结果集
//		final List<Good> resultList = new LinkedList<Good>();
//		jt.query("select * from t_goods limit 10", new RowCallbackHandler() {
//
//			@Override
//			public void processRow(ResultSet rs) throws SQLException {
//				Good good = new JTBaseSample().new Good();
//				// Good good = new Good();//需要static
//				good.setId(rs.getInt(1));
//				good.setStatus(rs.getInt(2));
//				good.setName(rs.getString(3));
//				resultList.add(good);
//			}
//		});

		// RowMapper 映射结果集
//		List<Good> resultList2 = jt.query("select * from t_goods limit 10", new RowMapper<Good>() {
//			@Override
//			public Good mapRow(ResultSet rs, int rowNum) throws SQLException {
//				Good good = new JTBaseSample2().new Good();
//				good.setId(rs.getInt(1));
//				good.setStatus(rs.getInt(2));
//				good.setName(rs.getString(3));
//				return good;//会一一添加到list中
//			}
//		});
//
//		Iterator<Good> ite = resultList2.iterator();
//		while (ite.hasNext()) {
//			Good good = ite.next();
//			System.out.println(good.toString());
//		}
		
		MyJdbcTemplate myJdbcTemplate = new MyJdbcTemplate(ds);
		
		Set<Good> set = 
				myJdbcTemplate.query("select * from t_goods limit 10", new MyResultSetHandler<Good>() {
			@Override
			public Good handlerResultSet(ResultSet rs) throws SQLException {
				Good good = new JTBaseSample2().new Good();
				good.setId(rs.getInt(1));
				good.setStatus(rs.getInt(2));
				good.setName(rs.getString(3));
				return good;//会一一添加到set中
			}
		});
		
		Iterator<Good> ite = set.iterator();
		while(ite.hasNext()){
			System.out.println(ite.next());
		}
	
	}

	private class Good {
		private int id;
		private int status;
		private String name;

		@Override
		public String toString() {
			return id + ":" + name;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getStatus() {
			return status;
		}

		public void setStatus(int status) {
			this.status = status;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}
	}
}
