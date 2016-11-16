package www.action;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class TloginAction {
	private String tnumber;
	private String tname;
	private String temail;
	Connection connect = DB_connect.connect();
    public String getTnumber() {
        return tnumber;
    }
    public String getTemail() {
        return temail;
    }
    public String getTname() {
        return tname;
    }
    public void setTnumber(String tnumber) {
        this.tnumber = tnumber;
    }
    public void setTemail(String temail) {
        this.temail = temail;
    }
    public void setTname(String tname) {
        this.tname = tname;
    }
    public String execute() throws Exception {
	  	Statement stmt;
	  	String sql = "select * from teacher where te='" + temail + "'";
	  	stmt = (Statement)connect.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		while(rs.next()){
			if(tnumber.equals(rs.getString("tnumber"))){
				tname=new String(rs.getString("tn"));
				connect.close();
				return "success";
			}
		}
		connect.close();
		return "error";
    }
}
