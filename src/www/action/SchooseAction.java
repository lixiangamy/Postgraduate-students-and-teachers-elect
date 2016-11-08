package www.action;
//Ñ¡Ôñµ¼Ê¦
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
public class SchooseAction {
	public String semail=null;
	public String sna=null;
	public String te=null;
    public String getSemail() {
        return semail;
    }
    public void setSemail(String semail) {
        this.semail=semail;
    }
    public String getSna() {
        return sna;
    }
    public void setSna(String sna) {
        this.sna=sna;
    }
    public String getTe() {
        return te;
    }
    public void setTe(String te) {
        this.te=te;
    }
    private ArrayList<String> BL = new ArrayList<String>();
    public ArrayList<String> getBL(){
		return BL;
	}
    public void setBT(ArrayList<String> BL) {
        this.BL = BL;
    }
    Connection connect_temp = DB_connect.connect();
    Connection connect_temp2 = DB_connect.connect();
	public String execute() throws Exception {
		Statement stmt;
		Statement stmt2;
		int f=0;
		String sql = "select * from teacher";
		stmt = (Statement)connect_temp.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		
		while(rs.next())
		{
			f=0;
			te=rs.getString("te");
			String sql2 = "select * from st where se='" + semail + "'";
			stmt2 = (Statement)connect_temp2.createStatement();
			ResultSet rs2 = stmt2.executeQuery(sql2);
			while(rs2.next())
			{
				sna=rs2.getString("sn");
				if(te.equals(new String(rs2.getString("te"))))
				{
					f=1;
				}
			}
			if(f==0)
			{
				BL.add(new String(rs.getString("tn")));
			}
		}
		return "success";
    }
}
