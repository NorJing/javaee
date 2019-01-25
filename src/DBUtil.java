import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DBUtil {
	public Connection getConnection() {
		Properties prop = new Properties();
		String driver = null;
		String url = null;
		String username = null;
		String password = null;
		try {
			System.out.println("get connection.");
			prop.load(this.getClass().getClassLoader().getResourceAsStream("config\\DBconfig.properties"));
			driver = prop.getProperty("driver");
			url = prop.getProperty("url");
			username = prop.getProperty("username");
			password = prop.getProperty("password");
			Class.forName(driver);
			return DriverManager.getConnection(url, username, password);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public void closeConnection(Connection conn) {
		
		if(conn != null) {
			try {
				conn.close();
				System.out.println("closed");
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}
