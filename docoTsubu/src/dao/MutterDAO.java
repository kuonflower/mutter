package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Mutter;

public class MutterDAO {

	private final String DB_PATH = "jdbc:mysql://localhost:3306/docotsubu";

	private final String DB_CHARACTER_ENCODE = "?useUnicode=true&characterEncoding=utf8";

	private final String DB_USER = "root";
	private final String DB_PASS = "root";

	private final String JDBC_DRIVER = "com.mysql.jdbc.Driver";

	public MutterDAO() {
		try{
			Class.forName(JDBC_DRIVER);
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
	}

	public List<Mutter> findAll(){
		List<Mutter> mutterList = new ArrayList<Mutter>();

		try(Connection conn = DriverManager.getConnection(DB_PATH + DB_CHARACTER_ENCODE,DB_USER,DB_PASS)){

			String sql = "SELECT ID,NAME,TEXT FROM MUTTER ORDER BY ID DESC";
			PreparedStatement pStmt = conn.prepareStatement(sql);


			ResultSet rs = pStmt.executeQuery();

			System.out.println("findAllメソッド");

			while(rs.next()){
				int id = rs.getInt("ID");
				String name = rs.getString("NAME");
				String text = rs.getString("TEXT");

				Mutter mutter = new Mutter(id,name,text);
				mutterList.add(mutter);

				System.out.println(id + name + text + "MutterDAOクラス");
			}



		}catch (SQLException e){
			e.printStackTrace();
		}
		return mutterList;
	}


	public boolean create(Mutter mutter){

		try(Connection conn = DriverManager.getConnection(DB_PATH + DB_CHARACTER_ENCODE,DB_USER,DB_PASS)){
			String sql = " INSERT INTO MUTTER (NAME,TEXT) VALUES(?,?)";
			PreparedStatement pStmt = conn.prepareStatement(sql);

			pStmt.setString(1, mutter.getUserName());
			pStmt.setString(2, mutter.getText());

			int result = pStmt.executeUpdate();

			if(result != 1){
				return false;
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		return true;
	}
}
