package www.action;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

//ѧ����Ϣ
public class SinforAction {
	Statement stmt;
	private String sna;//����
	private int sage;//����
	private String semail;//email
	private int ssex;//�Ա�
	private String sxuehao;//ѧ��
	private String sschool;//����ԺУ
	private String sm;//����רҵ
	private int sp;//����
	private String sc;//�ɹ�
	private int sb;//�Ƿ����
	private String snumber;//����
	private int sd;//�Ƿ��е�ʦ
	private String photo;//������
	private String pone;//����֤��
	private String ptwo;
	private String pthree;
	private String prove;//ѧ��֤��
	private String path="/space/uppicture/";//·��
	private String photopath=null;//������
	private String ponepath=null;//����֤��
	private String ptwopath=null;
	private String pthreepath=null;
	private String provepath=null;//ѧ��֤��
	
    public String getSna(){
		return sna;
	}
    public int getSage(){
		return sage;
	}
    public String getSemail() {
        return semail;
    }
    public int getSsex(){
		return ssex;
	}
    public String getSxuehao(){
		return sxuehao;
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
    public String getSc(){
		return sc;
	}
    public int getSb(){
		return sb;
	}
    public String getSnumber(){
		return snumber;
	}
    public int getSd(){
		return sd;
	}
    public String getPhoto(){
		return photo;
	}
    public String getPone(){
		return pone;
	}
    public String getPtwo(){
		return ptwo;
	}
    public String getPthree(){
		return pthree;
	}
    public String getProve(){
		return prove;
	}
    public String getPhotopath(){
		return photopath;
	}
    public String getPonepath(){
		return ponepath;
	}
    public String getPtwopath(){
		return ptwopath;
	}
    public String getPthreepath(){
		return pthreepath;
	}
    public String getProvepath(){
		return provepath;
	}
    public void setSna(String sna) {
        this.sna = sna;
    }
    public void setSage(int sage) {
        this.sage = sage;
    }
    public void setSemail(String semail) {
        this.semail = semail;
    }
    public void setSsex(int ssex) {
        this.ssex = ssex;
    }
    public void setSxuehao(String sxuehao) {
        this.sxuehao = sxuehao;
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
    public void setSc(String sc) {
        this.sc = sc;
    }
    public void setSb(int sb) {
        this.sb = sb;
    }
    public void setSnumber(String snumber) {
        this.snumber = snumber;
    }
    public void setSd(int sd) {
        this.sd = sd;
    }
    public void setPhoto(String photo) {
        this.photo = photo;
    }
    public void setPone(String pone) {
        this.pone = pone;
    }
    public void setPtwo(String ptwo) {
        this.ptwo = ptwo;
    }
    public void setPthree(String pthree) {
        this.pthree = pthree;
    }
    public void setProve(String prove) {
        this.prove = prove;
    }
    public String execute() throws Exception {
    	Connection ct = DB_connect.connect();
    	try
    	{ 
    		String sql = "select * from student";
			stmt = (Statement)ct.createStatement();
			ResultSet res = stmt.executeQuery(sql);
			String sql1 = "select * from student where e = '" + semail + "'";
			res = stmt.executeQuery(sql1);
			while(res.next())
			{
				sna = new String(res.getString("n"));
				sage = res.getInt("a");
				semail = new String(res.getString("e"));
				ssex = res.getInt("s");
				sxuehao = new String(res.getString("xuehao"));
				sschool = new String(res.getString("school"));
				sm = new String(res.getString("m"));
				sp = res.getInt("p");
				sc = new String(res.getString("c"));
				sb = res.getInt("b");
				snumber = new String(res.getString("number"));
				sd = res.getInt("d");
				photo = new String(res.getString("photo"));
				if(photo.equals("��"))
				{
					photopath = path+"6.png";
					
				}
				else
				{
					photopath = path+photo;
				}
				pone = new String(res.getString("pone"));
				if(pone.equals("��"))
				{
					ponepath = path+"��.png";
				}
				else
				{
					ponepath = path+pone;
				}
				ptwo = new String(res.getString("ptwo"));
				if(ptwo.equals("��"))
				{
					ptwopath = path+"��.png";
				}
				else
				{
					ptwopath = path+ptwo;
				}
				pthree = new String(res.getString("pthree"));
				if(pthree.equals("��"))
				{
					pthreepath = path+"��.png";
				}
				else
				{
					pthreepath = path+pthree;
				}
				prove = new String(res.getString("prove"));
				if(prove.equals("��"))
				{
					provepath = path+"��.png";
				}
				else
				{
					provepath = path+prove;
				}
				
			}
			ct.close();
			return "success";
		}
    	catch(Exception e)
    	{
			return "error";
		}
    }
    
    
}