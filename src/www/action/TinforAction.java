package www.action;
//��ʦ��Ϣ
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class TinforAction {
	Statement stmt;
	private String tname;//����
	private int ta;//����
	private String temail;//email
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
 	private String tnumber;//����
	private String tpone;//����֤��
	private String tptwo;
	private String tpthree;
	private String tpfour;//������
	private String path="/space/uppicture/";//·��
	private String tponepath=null;//����֤��
	private String tptwopath=null;
	private String tpthreepath=null;
	private String tpfourpath=null;//������
  	
     public String getTname(){
  		return tname;
  	}
     public int getTa(){
  		return ta;
  	}
     public String getTemail() {
          return temail;
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
     public String getTnumber(){
    		return tnumber;
    	}
     public String getTpone(){
 		return tpone;
 	}
     public String getTptwo(){
 		return tptwo;
 	}
     public String getTpthree(){
 		return tpthree;
 	}
     public String getTpfour(){
 		return tpfour;
 	}
     public String getTponepath(){
 		return tponepath;
 	}
     public String getTptwopath(){
 		return tptwopath;
 	}
     public String getTpthreepath(){
 		return tpthreepath;
 	}
     public String getTpfourpath(){
 		return tpfourpath;
 	}
      public void setTname(String tname) {
          this.tname = tname;
      }
      public void setTa(int ta) {
          this.ta = ta;
      }
      public void setTemail(String temail) {
          this.temail = temail;
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
     public void setTnumber(String tnumber) {
         this.tnumber = tnumber;
     }
     public void setTpone(String tpone) {
         this.tpone = tpone;
     }
     public void setTptwo(String tptwo) {
         this.tptwo = tptwo;
     }
     public void setTpthree(String tpthree) {
         this.tpthree = tpthree;
     }
     public void setTprove(String tpfour) {
         this.tpfour = tpfour;
     }
      public String execute() throws Exception {
      	Connection connect = DB_connect.connect();
    	try
    	{ 
    		String sql = "select * from teacher";
    		stmt = (Statement)connect.createStatement();
    		ResultSet res = stmt.executeQuery(sql);
    		String sql1 = "select * from teacher where te = '" + temail + "'";
    		res = stmt.executeQuery(sql1);
    		while(res.next())
    		{
    			tname = new String(res.getString("tn"));
    			ta = res.getInt("ta");
    			temail = new String(res.getString("te"));
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
  				tnumber = new String(res.getString("tnumber"));
 				tpone = new String(res.getString("tpone"));
				if(tpone.equals("��"))
				{
					tponepath = path+"��.png";
				}
				else
				{
					tponepath = path+tpone;
				}
				tptwo = new String(res.getString("tptwo"));
				if(tptwo.equals("��"))
				{
					tptwopath = path+"��.png";
				}
				else
				{
					tptwopath = path+tptwo;
				}
				tpthree = new String(res.getString("tpthree"));
				if(tpthree.equals("��"))
				{
					tpthreepath = path+"��.png";
				}
				else
				{
					tpthreepath = path+tpthree;
				}
				tpfour = new String(res.getString("tpfour"));
				if(tpfour.equals("��"))
				{
					tpfourpath = path+"6.png";
				}
				else
				{
					tpfourpath = path+tpfour;
				}
  				
  			}
    		connect.close();
    		return "success";
    	}
    	catch(Exception e)
    	{
    		return "error";
    	}
    }
}