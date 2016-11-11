package www.action;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class SyaoAction {
	public String semail=null;
	public String sna=null;
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
    private ArrayList<String> DL = new ArrayList<String>();
    public ArrayList<String> getDL(){
		return DL;
	}
    private ArrayList<String> DLL = new ArrayList<String>();
    public ArrayList<String> getDLL(){
		return DLL;
	}
    Connection connect_temz = DB_connect.connect();
    public String execute() throws Exception {
    	try {
    		DLL.clear();
        	DL.clear();
    		int f=0,cc;
    		Statement stmt;
    		String sql = "select * from ts where ste='" + semail + "'";
    		stmt = (Statement)connect_temz.createStatement();
    		ResultSet rs = stmt.executeQuery(sql);
    		String tean;
			while(rs.next())
			{
				tean=new String(rs.getString("ten"));
				cc=rs.getInt("statet");
				f=1;
				if(cc==0){
					sna=rs.getString("stn");
					DLL.add(tean);
				}
				else if(rs.getInt("statet")==1){
					sna=rs.getString("stn");
					DL.add(new String(rs.getString("ten")));
					DL.add("状态：同意");
				}
				else if(rs.getInt("statet")==2){
					
					sna=rs.getString("stn");
					DL.add(new String(rs.getString("ten")));
					DL.add("状态：不同意");
				}
				else if(cc==3){
					sna=rs.getString("stn");
					DLL.add(tean);
				}
			}
			if(f==1)
			{
				connect_temz.close();
				return "success";
			}
			else
			{
				connect_temz.close();
				return "error";
			}
    	} catch (Exception e) {
    		connect_temz.close();
			return "error";
  	    }
    }
}
