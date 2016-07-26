package book.chapter11.dao.jdbctemplate;

import java.util.List;
import java.util.ListIterator;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class JTBaseSample {
	public static void main(String[] args) {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setUrl("jdbc:mysql://114.215.97.155:3306/jf_dev_edc");
		ds.setUsername("jfdev");
		ds.setPassword("Egw4frZio643G354");
		
		JdbcTemplate jt = new JdbcTemplate(ds);
		List result = jt.queryForList("select id,title from jf_periodical_news limit 10");
		
		ListIterator ite = result.listIterator();
		while(ite.hasNext()){
			System.out.println(ite.next());
		}
	}
}
