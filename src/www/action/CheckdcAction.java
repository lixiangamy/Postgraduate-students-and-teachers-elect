package www.action;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
//dx�����ʦ���֣���ʾ��ʦ��Ϣ
public class CheckdcAction {

	Statement stmt;
	private String dx;//����
	private int tage;//����
	private String temail;//email
	private int tsex;//�Ա�
  	private String tjzgh;//��ְ����	
 	private String induction;//�о�����
 	private String tc;//�о��ɹ�
 	private int tsuccess;//�Ѿ��ɹ���ѧ������
 	private int tx;//�Ƿ���ʾ����
 	private String tschool;//ѧУ
 	private String tm;//Ҫ��ѧ����רҵ
 	private int tb;//�Ƿ�Ҫ��ѧ������
 	private int tp;//��ѧ��������Ҫ��
 	private String tsschool;//��ѧ��ѧУ��Ҫ��
 	private blob tpone;
 	private blob tptwo;
 	private blob tpthree;
  	//��Ƭ
  	
 	
 	
     public String getdx(){
  		return dx;
  	}
     public int getTage(){
  		return tage;
  	}
     public String getTemail() {
          return temail;
      }
     public int getTsex(){
  		return tsex;
  	}
     public String getTjzgh(){
  		return tjzgh;
  	}
     public String getInduction(){
 		return induction;
 	}
     public String getTc(){
 		return tc;
 	}
     public int getTsuccess(){
 		return tsuccess;
 	}
     public int getTx(){
 		return tx;
 	}
     public String getTschool(){
 		return tschool;
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
      public void setDx(String dx) {
          this.dx = dx;
      }
      public void setTage(int tage) {
          this.tage = tage;
      }
      public void setTemail(String temail) {
          this.temail = temail;
      }
      public void setTsex(int tsex) {
          this.tsex = tsex;
      }
       public void setTjzgh(String tjzgh) {
           this.tjzgh = tjzgh;
       }
     public void setInduction(String induction) {
         this.induction = induction;
     }
     public void setTc(String tc) {
         this.tc = tc;
     }
     public void setTsuccess(int tsuccess) {
         this.tsuccess = tsuccess;
     }
     public void setTx(int tx) {
         this.tx = tx;
     }
     public void setTschool(String tschool) {
         this.tschool = tschool;
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
      public String execute() throws Exception {
      	Connection ct = DB_connect.connect();
    	try
    	{ 
    		String sql = "select * from teacher";
    		stmt = (Statement)connect.createStatement();
    		ResultSet res = stmt.executeQuery(sql);
    		String sql1 = "select * from teacher where tn = '" + dx + "'";
    		res = stmt.executeQuery(sql1);
    		if(!res.next())
    		{
    			return "error";
    		}
    		else
    		{
    			dx = new String(res.getString("tn"));
    			tage = res.getInt("ta");
    			tsex = res.getInt("ts");
  				tjzgh = new String(res.getString("jzgh"));
 				induction = new String(res.getString("induction"));
 				tc = new String(res.getString("tc"));
 				tsuccess = res.getInt("tsuccess"); 
 				tx = res.getInt("tx");
 				if(tx==1)//���������ʾ
 				{
 					temail = new String(res.getString("te"));
 				}
 				else
 				{
 					temail = "--@--";
 				}
 				tschool = new String(res.getString("tschool"));
 				tm = new String(res.getString("tm"));
 				tb = res.getInt("tb");
 				tp = res.getInt("tp");
 				tsschool = new String(res.getString("tsschool"));
  				connect.close();
  				return "success";
  			}

    	}
    	catch(Exception e)
    	{
    		return "error";
    	}
    }
}
