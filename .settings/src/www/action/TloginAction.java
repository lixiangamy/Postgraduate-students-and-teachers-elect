package www.action;

public class TloginAction {
	private String tnumber;
	private String temail;
    public String getTnumber() {
        return tnumber;
    }
    public String getTemail() {
        return temail;
    }
    public void setTnumber(String tnumber) {
        this.tnumber = tnumber;
    }
    public void setTemail(String temail) {
        this.temail = temail;
    }
    public String execute() throws Exception {
    	 return "success";
    }

}
