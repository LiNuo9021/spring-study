package book.chapter11.dao.jdbctemplate;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

import com.mysql.jdbc.Statement;

public class JTBaseSample {
	public static void main(String[] args) {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setUrl("jdbc:mysql://114.215.97.155:3306/jf_dev_edc");
		ds.setUsername("jfdev");
		ds.setPassword("Egw4frZio643G354");

		JdbcTemplate jt = new JdbcTemplate(ds);

		// update
		// int affectCount = jt.update("update jf_periodical_news set
		// title='hello world' where id=?", 15);
		// jt.update("", new Object[]{}, Types.CLOB);

		// select
		// List result = jt.queryForList("select id,title from
		// jf_periodical_news limit 10");
		// ListIterator ite = result.listIterator();
		// while(ite.hasNext()){
		// System.out.println(ite.next());
		// }

		// 获取主键值
		// final String sql = "insert into t_user(user_name) values(?)";
		// KeyHolder keyHolder = new GeneratedKeyHolder();
		// jt.update(new PreparedStatementCreator() {
		// @Override
		// public PreparedStatement createPreparedStatement(Connection con)
		// throws SQLException {
		// PreparedStatement ps = con.prepareStatement(sql,
		// Statement.RETURN_GENERATED_KEYS);
		// ps.setString(1, "linuo");
		// return ps;
		// }
		// }, keyHolder);
		// System.out.println("key: " + keyHolder.getKey());

		// 批量更新
		// final List<String> names = new ArrayList<String>();
		// names.add("li");
		// names.add("li2");
		// names.add("li3");
		// jt.batchUpdate("insert into t_user(user_name) values(?)", new
		// BatchPreparedStatementSetter() {
		// @Override
		// public void setValues(PreparedStatement ps, int i) throws
		// SQLException {
		// ps.setString(1, names.get(i));
		// }
		// @Override
		// public int getBatchSize() {
		// return names.size();
		// }
		// });

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
		List<Good> resultList2 = jt.query("SELECT * FROM t_goods LIMIT 10", new RowMapper<Good>() {
			@Override
			public Good mapRow(ResultSet rs, int rowNum) throws SQLException {
				Good good = new JTBaseSample().new Good();
				good.setId(rs.getInt(1));
				good.setStatus(rs.getInt(2));
				good.setName(rs.getString(3));
				return good;//会一一添加到list中
			}
		});

		Iterator<Good> ite = resultList2.iterator();
		while (ite.hasNext()) {
			Good good = ite.next();
			System.out.println(good.toString());
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
