package www.action;
//导师邀请
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
    public void setDL(ArrayList<String> DL) {
        this.DL = DL;
    }
    private ArrayList<String> DIL = new ArrayList<String>();
    public ArrayList<String> getDIL(){
		return DIL;
	}
    public void setDIL(ArrayList<String> DIL) {
        this.DIL = DIL;
    }
    private ArrayList<String> DLL = new ArrayList<String>();
    public ArrayList<String> getDLL(){
		return DLL;
	}
    public void setDLL(ArrayList<String> DLL) {
        this.DLL = DLL;
    }
   
    Connection connect_tem = DB_connect.connect();
    public String execute() throws Exception {
    	try {
    		int f=0;
    		Statement stmt;
    		String sql = "select * from ts where ste='" + semail + "'";
    		stmt = (Statement)connect_tem.createStatement();
    		ResultSet rs = stmt.executeQuery(sql);
			while(rs.next())
			{
				f=1;
				if(rs.getInt("statet")==0){
					sna=rs.getString("stn");
					DLL.add(new String(rs.getString("ten")));
				}
				else if(rs.getInt("statet")==1){
					DIL.add("状态：同意");
					sna=rs.getString("stn");
					DL.add(new String(rs.getString("ten")));
				}
				else if(rs.getInt("statet")==2){
					DIL.add("状态：不同意");
					sna=rs.getString("stn");
					DL.add(new String(rs.getString("ten")));
				}
				else if(rs.getInt("statet")==3){
					DIL.add("状态：待定");
					sna=rs.getString("stn");
					DL.add(new String(rs.getString("ten")));
				}
			}
			if(f==1)
			{
				connect_tem.close();
				return "success";
			}
			else
			{
				connect_tem.close();
				return "error";
			}
    	} catch (Exception e) {
    		connect_tem.close();
			return "error";
  	    }
    }
}
