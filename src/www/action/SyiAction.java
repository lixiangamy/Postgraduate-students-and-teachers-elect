package www.action;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class SyiAction {
	private String semail=null;
	private String sna;
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
    private ArrayList<String> BL = new ArrayList<String>();
    public ArrayList<String> getBL(){
		return BL;
	}
    public void setBT(ArrayList<String> BL) {
        this.BL = BL;
    }
    Connection connect_temp = DB_connect.connect();
    public String execute() throws Exception {
    	try {
    		int f=0;
    		BL.clear();
    		Statement stmt;
    		String sql = "select * from st where se='" + semail + "'";
    		stmt = (Statement)connect_temp.createStatement();
    		ResultSet rs = stmt.executeQuery(sql);
			while(rs.next())
			{
				f=1;
				BL.add(new String(rs.getString("tn")));
				if(rs.getInt("state")==0){
					BL.add("状态：导师未选择");
				}
				else if(rs.getInt("state")==1){
					BL.add("状态：同意");
				}
				else if(rs.getInt("state")==2){
					BL.add("状态：不同意");
				}
				else if(rs.getInt("state")==3){
					BL.add("状态：待定");
				}
			}
			if(f==0)
			{
				connect_temp.close();
				return "error";
			}
			else
			{
				connect_temp.close();
				return "success";
			}
    	} catch (Exception e) {
    		connect_temp.close();
			return "error";
  	    }
    }
}
