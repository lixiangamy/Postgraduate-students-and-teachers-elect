package www.action;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class XiugAction {
	
	private String sna;//姓名
	private int sage;//年龄
	private String semail;//email
	private int ssex;//性别
	private String sxuehao;//学号
	private String sschool;//本科院校
	private String sm;//本科专业
	private int sp;//排名
	private String sc;//成果
	private int sb;//是否读博
	private String snumber;//密码
	private int sd;//是否有导师
	private String photo;//生活照
	private String pone;//三个证明
	private String ptwo;
	private String pthree;
	private String prove;//学号证明
	private String path="/space/uppicture/";//路径
	private String photopath=null;//生活照
	private String ponepath=null;//三个证明
	private String ptwopath=null;
	private String pthreepath=null;
	private String provepath=null;//学号证明
	
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
    public void setSage(int sage) {
        this.sage = sage;
    }
    public void setSemail(String semail) {
        this.semail = semail;
    }
    public void setSna(String sna) {
        this.sna = sna;
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
    	
    	Statement stmt;
    	Connection ct = DB_connect.connect();
		stmt = (Statement)ct.createStatement();
		String sql1 = "select * from student where e='" + semail + "'";
		ResultSet res = stmt.executeQuery(sql1);
		while(res.next())
		{
			sna = new String(res.getString("n"));
			ssex = res.getInt("s");
			sxuehao = new String(res.getString("xuehao"));
			sschool = new String(res.getString("school"));
			sm = new String(res.getString("m"));
			sp = res.getInt("p");
			photo = new String(res.getString("photo"));
			if(photo.equals("无"))
			{
				photopath = path+"无.png";
			}
			else
			{
				photopath = path+photo;
			}
			pone = new String(res.getString("pone"));
			if(pone.equals("无"))
			{
				ponepath = path+"无.png";
			}
			else
			{
				ponepath = path+pone;
			}
			ptwo = new String(res.getString("ptwo"));
			if(ptwo.equals("无"))
			{
				ptwopath = path+"无.png";
			}
			else
			{
				ptwopath = path+ptwo;
			}
			pthree = new String(res.getString("pthree"));
			if(pthree.equals("无"))
			{
				pthreepath = path+"无.png";
			}
			else
			{
				pthreepath = path+pthree;
			}
			prove = new String(res.getString("prove"));
			if(prove.equals("无"))
			{
				provepath = path+"无.png";
			}
			else
			{
				provepath = path+prove;
			}
		}
		if(sb!=0&&sb!=1)
		{
			return "error";
		}
		if(sage==0)
		{
			return "error";
		}
		if(sage<12||sage>=100)
		{
			return "error";
		}
		if(snumber.length()<8)
		{
			return "error";
		}

		String sql2=" update student set n='" + sna + "',a=" + sage + ",s=" + ssex + " ,xuehao='" + sxuehao + "' ,school='" + sschool + "' ,m='" + sm + "' ,p='" + sp + "' ,c='" + sc + "' ,b=" + sb + " ,number='" + snumber + "' ,d=" + sd + ",photo='" + photo + "',pone='" + pone + "',ptwo='" + ptwo + "',pthree='" + pthree + "',prove='" + prove + "' " + " where e = '" + semail + "'";
		int rs=stmt.executeUpdate(sql2);
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
