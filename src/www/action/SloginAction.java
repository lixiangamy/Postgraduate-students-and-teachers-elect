package www.action;
//Ñ§ÉúµÇÂ¼
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
public class SloginAction {
	private String snumber;
	private String semail;
	private String sna;
	Connection connect = DB_connect.connect();
    public String getSnumber() {
        return snumber;
    }
    public String getSna() {
        return sna;
    }
    public String getSemail() {
        return semail;
    }
    public void setSnumber(String snumber) {
        this.snumber = snumber;
    }
    public void setSemail(String semail) {
        this.semail = semail;
    }
    public String execute() throws Exception {
	  	Statement stmt;
	  	String sql = "select * from student where e='" + semail + "'";
	  	stmt = (Statement)connect.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		while(rs.next()){
			if(snumber.equals(rs.getString("number"))){
				sna=new String(rs.getString("n"));
				connect.close();
				return "success";
			}
		}
		connect.close();
		return "error";
    }
}
