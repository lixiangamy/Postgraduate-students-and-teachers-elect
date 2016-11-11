package www.action;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import www.action.DB_connect;

public class SapplyAction {
	private String snamea;//姓名
	private int sagea;//年龄
	private String semaila;//email
	private int ssexa;//性别
	private String snuma;//学号
	private String schoola;//本科院校
	private String smaina;//本科专业
	private int srankinga;//排名
	private String schena;//成果
	private int sboa;//是否读博
	private String snumbera;//密码
	//照片
	Connection connect_temp = DB_connect.connect();
	Connection connect_tempp = DB_connect.connect();
	Connection connect_temppp = DB_connect.connect();
    public String getSnamea(){
		return snamea;
	}
    public int getSagea(){
		return sagea;
	}
    public String getSemaila() {
        return semaila;
    }
    public int getSsexa(){
		return ssexa;
	}
    public String getSnuma(){
		return snuma;
	}
    public String getSchoola(){
		return schoola;
	}
    public String getSmaina(){
		return smaina;
	}
    public int getSrankinga(){
		return srankinga;
	}
    public String getSchena(){
		return schena;
	}
    public int getSboa(){
		return sboa;
	}
    public String getSnumbera(){
		return snumbera;
	}
    public void setSnamea(String snamea) {
        this.snamea = snamea;
    }
    public void setSagea(int sagea) {
        this.sagea = sagea;
    }
    public void setSemaila(String semaila) {
        this.semaila = semaila;
    }
    public void setSsexa(int ssexa) {
        this.ssexa = ssexa;
    }
    public void setSnuma(String snuma) {
        this.snuma = snuma;
    }
    public void setSchoola(String schoola) {
        this.schoola = schoola;
    }
    public void setSmaina(String smaina) {
        this.smaina = smaina;
    }
    public void setSrankinga(int srankinga) {
        this.srankinga = srankinga;
    }
    public void setSchena(String schena) {
        this.schena = schena;
    }
    public void setSboa(int sboa) {
        this.sboa = sboa;
    }
    public void setSnumbera(String snumbera) {
        this.snumbera = snumbera;
    }	
	public String execute() throws Exception {
		System.out.println("#######");
		System.out.println(snamea+"888888888");
		System.out.println(sagea);
		System.out.println(semaila);
		System.out.println(ssexa);
		System.out.println(snuma);
		System.out.println(schoola);
		System.out.println(smaina);
		System.out.println(srankinga);
		System.out.println(schena);
		System.out.println(sboa);
		System.out.println(snumbera);
		return "error";
    }
}
