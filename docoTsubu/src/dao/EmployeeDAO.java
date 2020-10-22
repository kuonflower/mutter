package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Employee;

public class EmployeeDAO {
	private final String DB_PATH ="jdbc:mysql://localhost:3306/docotsubu";
	//データーベースのアドレスに付け足される
	private final String DB_CHARACTER_ENCODING = "?useUnicode=true&characterEncoding=utf8";
	//ユーザーネーム　パス
	private final String DB_USER = "root";
	private final String DB_PASS = "root";
	//JDBCドライバー
	private final String JDBC_DRIVER = "com.mysql.jdbc.Driver";


	//お約束①　コンストラクタでJDBCドライバを読み込み
	public EmployeeDAO(){
		try{
			Class.forName(JDBC_DRIVER);
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
	}

	//情報取得用メソッド


	public List<Employee> findAll(){
		List<Employee> empList = new ArrayList<>();


		//データベース接続
		try(Connection conn = DriverManager.getConnection(DB_PATH + DB_CHARACTER_ENCODING,DB_USER,DB_PASS)){
			String sql = "SELECT ID, NAME, AGE FROM EMPLOYEE";
			PreparedStatement pStmt = conn.prepareStatement(sql);

			ResultSet rs = pStmt.executeQuery();










			while(rs.next()){
				String id = rs.getString("ID");
				String name = rs.getString("NAME");
				int age = rs.getInt("AGE");
				Employee employee = new Employee(id,name,age);
				empList.add(employee);
			}

		}catch (SQLException e){
			e.printStackTrace();
			return null;
		}
		return empList;
	}

}
