package www.action;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class TyiAction {
	private String tname;
	private String temail;
    public String getTemail() {
        return temail;
    }
    public void setTemail(String temail) {
        this.temail=temail;
    }
    public String getTname() {
        return tname;
    }
    public void setTname(String tname) {
        this.tname=tname;
    }
    private ArrayList<String> TL = new ArrayList<String>();
    public ArrayList<String> getTL(){
		return TL;
	}
    Connection connect_t = DB_connect.connect();
    public String execute() throws Exception {
    	Statement stmt;
    	int f=0;
    	String sql = "select * from ts where tee='" + temail + "'";
		stmt = (Statement)connect_t.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
			while(rs.next())
			{
				f=1;
				TL.add(new String(rs.getString("stn")));
				if(rs.getInt("statet")==0){
					TL.add("״̬��ѧ��δѡ��");
				}
				else if(rs.getInt("statet")==1){
					TL.add("״̬��ͬ��");
				}
				else if(rs.getInt("statet")==2){
					TL.add("״̬����ͬ��");
				}
				else if(rs.getInt("statet")==3){
					TL.add("״̬������");
				}
			}
			if(f==0)
			{
				connect_t.close();
				return "error";
			}
			else
			{
				connect_t.close();
				return "success";
			}
			
    }
}
