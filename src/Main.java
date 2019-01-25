import java.sql.Connection;

public class Main {

	public static void main(String[] args) {
		DBUtil dbUtil = new DBUtil();
		Connection conn = dbUtil.getConnection();
		// Statement
		// ResultSet
		System.out.println(conn);
		dbUtil.closeConnection(conn);
	}

	
}
