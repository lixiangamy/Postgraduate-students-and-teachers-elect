package www.action;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class TStateAction {
	public int state;
	public String sn=null;
	public String temail=null;
	public String tname=null;
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
    public String getSn() {
        return sn;
    }
    public void setSn(String sn) {
        this.sn=sn;
    }
    public int getState() {
        return state;
    }
    public void setState(int state) {
        this.state=state;
    }
    private ArrayList<String> DL = new ArrayList<String>();
    public ArrayList<String> getDL(){
		return DL;
	}
    private ArrayList<String> DLL = new ArrayList<String>();
    public ArrayList<String> getDLL(){
		return DLL;
	}
    Connection connect_tem3 = DB_connect.connect();
    Connection connect_tem = DB_connect.connect();
    Connection connect_tem2 = DB_connect.connect();
    Connection connect_tem4 = DB_connect.connect();
    public String execute() throws Exception {
    	DLL.clear();
    	DL.clear();
		int f=0,cc;
    		Statement stmt2,stmt4;
    		if(state==1)
    		{
    			String sql2 = "update student set d=1 where n='"+ sn +"'";
	    		stmt2 = (Statement)connect_tem2.createStatement();
	    		stmt2.executeUpdate(sql2);
	    		sql2 = "update teacher set tx=tx+1 where te='"+ temail +"'";
	    		stmt2 = (Statement)connect_tem2.createStatement();
	    		stmt2.executeUpdate(sql2); 
	    		sql2= "update st set state=2 where sn='"+ sn +"'";
	    		stmt2 = (Statement)connect_tem2.createStatement();
	    		stmt2.executeUpdate(sql2);
	    		sql2 = "update ts set statet=2 where stn='"+ sn +"'";
	    		stmt2 = (Statement)connect_tem2.createStatement();
	    		stmt2.executeUpdate(sql2);
	    		connect_tem2.close();
	    		String sql4 = "update st set state=1 where sn='"+ sn +"' and te='" + temail +"'";
	    		stmt4 = (Statement)connect_tem4.createStatement();
	    		stmt4.executeUpdate(sql4);
	    		sql4 = "update ts set statet=1 where stn='"+ sn +"' and tee='" + temail +"'";
	    		stmt4 = (Statement)connect_tem4.createStatement();
	    		stmt4.executeUpdate(sql4);
	    		connect_tem4.close();
    		}
    		Statement stmt3;
    		String sql3 = "update st set state='" + state + "'where sn='"+ sn +"' and te='" + temail +"'";
    		stmt3 = (Statement)connect_tem3.createStatement();
    		stmt3.executeUpdate(sql3);
    		Statement stmt;
    		String sql = "select * from st where te='" + temail + "'";//申请该导师的所有学生
    		stmt = (Statement)connect_tem.createStatement();
    		ResultSet rs = stmt.executeQuery(sql);
    		String sean;
			while(rs.next())
			{
				sean=new String(rs.getString("sn"));
				cc=rs.getInt("state");
				f=1;
				if(cc==0){
					DLL.add(sean);
				}
				else if(rs.getInt("state")==1){
					DL.add(new String(rs.getString("sn")));
					DL.add("状态：同意");
				}
				else if(rs.getInt("state")==2){
					DL.add(new String(rs.getString("sn")));
					DL.add("状态：不同意");
				}
				else if(cc==3){
					DLL.add(sean);
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
    }
}
