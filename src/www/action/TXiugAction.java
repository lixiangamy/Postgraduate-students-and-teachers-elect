package www.action;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class TXiugAction {
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
      public void setTa(int ta) {
          this.ta = ta;
      }
      public void setTemail(String temail) {
          this.temail = temail;
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
     public void setTm(String tm) {
         this.tm = tm;
     }
     public void setTname(String tname) {
         this.tname = tname;
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
     public static boolean isChinese(String str){
 		if(str.matches("[\\u4E00-\\u9FA5]+")) 
 			return true;
 		else
 			return false;
 	}
 public static boolean isEmptyString(String s)
     {
         if (s == null || s.length()==0)

         	return false;
         else 
         	return true;
     }

     public String execute() throws Exception {
    	 Connection ct = DB_connect.connect();
 		stmt = (Statement)ct.createStatement();
 		String sql1 = "select * from teacher where te='" + temail + "'";
 		ResultSet res = stmt.executeQuery(sql1);
 		while(res.next())
 		{
 			tname = new String(res.getString("tn"));
			ts = res.getInt("ts");
			jzgh = new String(res.getString("jzgh"));
			tschool = new String(res.getString("tschool"));
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
				tpfourpath = path+"��.png";
			}
			else
			{
				tpfourpath = path+tpfour;
			}
 		}
 		if(ta==0)
		{
 			return "error";
		}
		if(ta<20||ta>=100)
		{
			return "error";
		}
		if(TXiugAction.isEmptyString(induction))
		{
			if(!TXiugAction.isChinese(induction))
			{
				return "error";
			}
		}
		else
		{
			return "error";
		}
		if(tx!=0&&tx!=1)
		{
			return "error";
		}
		if(tb!=0&&tb!=1)
		{
			return "error";
		}
		if(tnumber.length()<8)
		{
			return "error";
		}
		if(tp<0)
		{
			return "error";
		}
		if(TXiugAction.isEmptyString(tsshool))
		{
			if(!TXiugAction.isChinese(tsshool))
			{
				return "error";
			}
		}
		else
		{
			return "error";
		}
		if(TXiugAction.isEmptyString(tm))
		{
			if(!TXiugAction.isChinese(tm))
			{
				return "error";
			}
		}
		else
		{
			return "error";
		}
		
 		String sql="update teacher set tn='" + tname + "',ta=" + ta + ",ts=" + ts + ",jzgh='" + jzgh + "',induction='" + induction + "',tc='" + tc + "',tsuccess=" + tsuccess + ",tx=" + tx + ",tschool='" + tschool + "',tm='" + tm + "',tb=" + tb + ",tp=" + tp + ",tsshool='" + tsshool + "',tnumber='" + tnumber + "',tpone='" + tpone + "',tptwo='" + tptwo + "',tpthree='" + tpthree + "',tpfour='" + tpfour + "' where te ='" + temail + "'";
 		int rs=stmt.executeUpdate(sql);
 		ct.close();

 		if(rs==1)
 		{
 			return "success";
 		}
 		else
 		{
 			return "error";
 		}
     }
}
