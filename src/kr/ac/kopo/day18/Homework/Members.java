package kr.ac.kopo.day18.Homework;

public class Members {
	
	private String id;
	private String pw;
	
	Members() {
		
	}
	
	Members(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}
	
	public String getId() {
		return id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}



}
