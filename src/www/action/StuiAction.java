package www.action;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class StuiAction {
	public String semail=null;
	private String sname;//����
	private String sschool;//����ԺУ
	private String sm;//����רҵ
	private int sp;//����
	private int sb;//�Ƿ����
	
	public String getSemail() {
        return semail;
    }
    public void setSemail(String semail) {
        this.semail=semail;
    }
    public String getSname(){
		return sname;
	}
    public String getSschool(){
		return sschool;
	}
    public String getSm(){
		return sm;
	}
    public int getSp(){
		return sp;
	}
    public int getSb(){
		return sb;
	}
    public void setSname(String sname) {
        this.sname = sname;
    }
    public void setSschool(String sschool) {
        this.sschool = sschool;
    }
    public void setSm(String sm) {
        this.sm = sm;
    }
    public void setSp(int sp) {
        this.sp = sp;
    }
    public void setSb(int sb) {
        this.sb = sb;
    }
    
    
    private String tname;//����	
    private String temail;//email
 	private String tm;//Ҫ��ѧ����רҵ
 	private int tb;//�Ƿ�Ҫ��ѧ������
 	private int tp;//��ѧ��������Ҫ��
 	private String tsschool;//��ѧ��ѧУ��Ҫ��
 	
     public String getTname(){
  		return tname;
  	}
     public String getTemail() {
         return temail;
     }
     public String getTm(){
 		return tm;
 	}
     public int getTb(){
 		return tb;
 	}
     public int getTp(){
 		return tp;
 	}
     public String getTsschool(){
  		return tsschool;
  	}
      public void setTname(String tname) {
          this.tname = tname;
      }
      public void setTemail(String temail) {
          this.temail = temail;
      }
     public void setTm(String tm) {
         this.tm = tm;
     }
     public void setTb(int tb) {
         this.tb = tb;
     }
     public void setTp(int tp) {
         this.tp = tp;
     }
     public void setTsschool(String tsschool) {
         this.tm = tsschool;
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
		int f=0;//�Ƿ������ĸ�����
		String sql = "select * from teacher";
		stmt = (Statement)connect_temp.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		while(rs.next())
		{
			f=0;
			temail=rs.getString("te");
			String sql2 = "select * from st where se='" + semail + "'";//����ѧ����ѡ��ĵ�ʦ
			stmt2 = (Statement)connect_temp2.createStatement();
			ResultSet rs2 = stmt2.executeQuery(sql2);
			while(rs2.next())
			{
				sname=rs2.getString("sn");
				if(te.equals(new String(rs2.getString("te"))))
				{
					f=1;
				}
				if(!tm.equals(""))
				{
					if(!sm.equals(rs.getString("tm"))&&!sm.equals(""))
					{
						f=1;
					}
				}
				if(rs.getInt("tb")!=sb)
				{
					f=1;
				}
				if(rs.getInt("tp")<sp)
				{
					f=1;
				}
				if(!tsschool.equals(""))
				{
					if(!sschool.equals(rs.getString("tsschool"))&&!sschool.equals(""))
					{
						f=1;
					}
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
