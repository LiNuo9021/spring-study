package book.chapter11.dao.jdbctemplate.lob;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.support.lob.DefaultLobHandler;
import org.springframework.jdbc.support.lob.LobHandler;

public class InsertLobSample {
	public static void main(String[] args) throws IOException {
		DriverManagerDataSource ds = 	
				new DriverManagerDataSource("jdbc:mysql://114.215.97.155:3306/jf_dev_edc", "jfdev", "Egw4frZio643G354");
	
		JdbcTemplate jt = new JdbcTemplate(ds);
		
		final LobHandler lobHandler = new DefaultLobHandler();
		
//		final Good good = new Good();
//		good.setName("shoes");
//		good.setStatus(1);
//		good.setIntroduction("这是一只鞋子，仅一只哦");
//		good.setImage(FileCopyUtils.copyToByteArray(new ClassPathResource("shoes.png").getInputStream()));
//		
//		jt.execute("insert into t_goods(status,name,image,introduction) values(?,?,?,?)", new AbstractLobCreatingPreparedStatementCallback(lobHandler) {
//			@Override
//			protected void setValues(PreparedStatement ps, LobCreator lobCreator) throws SQLException, DataAccessException {
//				ps.setInt(1, good.getStatus());
//				ps.setString(2, good.getName());
//				lobCreator.setBlobAsBytes(ps, 3, good.getImage());
//				lobCreator.setClobAsString(ps, 4, good.getIntroduction());
//			}
//		});
		
		List<Good> list = jt.query("select name,image,introduction from t_goods where id=6", new RowMapper<Good>() {
			@Override
			public Good mapRow(ResultSet rs, int rowNum) throws SQLException {
				Good good = new Good();
				good.setName(rs.getString(1));
				good.setImage(lobHandler.getBlobAsBytes(rs, 2));
				good.setIntroduction(lobHandler.getClobAsString(rs, 3));
				return good;
			}
		});
		
		Iterator<Good> ite = list.iterator();
		while(ite.hasNext()){
			Good goood = ite.next();
			if(goood.getName() != null && goood.getImage() != null){
				System.out.println(goood.getName());
				System.out.println(goood.getIntroduction());
				byte[] image = goood.getImage();
				FileOutputStream fos = new FileOutputStream(new File("good.png"));
				fos.write(image);
				fos.flush();
				fos.close();
			}
			else{
				System.out.println("null");
			}
		}
		
		
		jt.query(sql, rse)
		
		
		

	}
	static class Good {
		private int id;
		private int status;
		private String name;
		private byte[] image;
		private String introduction;

		public String getIntroduction() {
			return introduction;
		}

		public void setIntroduction(String introduction) {
			this.introduction = introduction;
		}

		public byte[] getImage() {
			return image;
		}

		public void setImage(byte[] image) {
			this.image = image;
		}

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
