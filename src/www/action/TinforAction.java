package www.action;
//��ʦ��Ϣ
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class TinforAction {
	Statement stmt;
	private String tn;//����
	private int ta;//����
	private String te;//email
	private int ts;//�Ա�
  	private String jzgh;//��ְ����	
 	private String induction;//�о�����
 	private String tc;//�о��ɹ�
 	private int tsuccess;//�Ѿ��ɹ���ѧ������
 	private int tx;//�Ƿ���ʾ����
 	private String tschool;//ѧУ
 	private String tm;//Ҫ��ѧ����רҵ
 	private int tb;//�Ƿ�Ҫ��ѧ������
 	private int tp;//��ѧ��������Ҫ��
 	private String tsshool;//��ѧ��ѧУ��Ҫ��

  	//��Ƭ
  	
     public String getTn(){
  		return tn;
  	}
     public int getTa(){
  		return ta;
  	}
     public String getTe() {
          return te;
      }
     public int getTs(){
  		return ts;
  	}
     public String getJzgh(){
  		return jzgh;
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
     public String getTsshool(){
  		return tsshool;
  	}
      public void setTn(String tn) {
          this.tn = tn;
      }
      public void setTa(int ta) {
          this.ta = ta;
      }
      public void setTe(String te) {
          this.te = te;
      }
      public void setTs(int ts) {
          this.ts = ts;
      }
       public void setJzgh(String jzgh) {
           this.jzgh = jzgh;
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
     public void setTsshool(String tsshool) {
         this.tsshool = tsshool;
     }
      public String execute() throws Exception {
      	Connection connect = DB_connect.connect();
    	try
    	{ 
    		String sql = "select * from teacher";
    		stmt = (Statement)connect.createStatement();
    		ResultSet res = stmt.executeQuery(sql);
    		String sql1 = "select * from teacher where te = '" + te + "'";
    		res = stmt.executeQuery(sql1);
    		if(!res.next())
    		{
    			return "error";
    		}
    		else
    		{
    			tn = new String(res.getString("tn"));
    			ta = res.getInt("ta");
    			te = new String(res.getString("te"));
    			ts = res.getInt("ts");
  				jzgh = new String(res.getString("jzgh"));
 				induction = new String(res.getString("induction"));
 				tc = new String(res.getString("tc"));
 				tsuccess = res.getInt("tsuccess"); 
 				tx = res.getInt("tx");
 				tschool = new String(res.getString("tschool"));
 				tm = new String(res.getString("tm"));
 				tb = res.getInt("tb");
 				tp = res.getInt("tp");
 				tsshool = new String(res.getString("tsshool"));
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