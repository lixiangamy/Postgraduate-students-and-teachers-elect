package www.action;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class TloginAction {
	private String tnumber;
	private String temail;
	Connection connect = DB_connect.connect();
    public String getTnumber() {
        return tnumber;
    }
    public String getTemail() {
        return temail;
    }
    public void setTnumber(String tnumber) {
        this.tnumber = tnumber;
    }
    public void setTemail(String temail) {
        this.temail = temail;
    }
    public String execute() throws Exception {
	  	Statement stmt;
	  	String sql = "select * from teacher where te='" + temail + "'";
	  	stmt = (Statement)connect.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		while(rs.next()){
			if(tnumber.equals(rs.getString("tnumber"))){
				connect.close();
				return "success";
			}
		}
		connect.close();
		return "error";
    }
}
