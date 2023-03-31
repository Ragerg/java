package kr.ac.kopo.day19.hw18;

/*
	art + Shift + s 를 누른 후  c : 디폴트 생성자 
	                         o : 매개변수를 가진 생성자 
                             r : getter/setter 메소드 
	                         s : toString() 오버라이드 
	                         v : 오버라이드 메소드 
 */


public class Member {


	private String id;
	private String pw;
	
	
	public Member() {
		super();
	}


	public Member(String id) {
		super();
		this.id = id;
	}


	public Member(String id, String pw) {
		super();
		this.id = id;
		this.pw = pw;
	}
	
	public String getId() {
		return id;
	}
	
	
	public void setId(String id) {
		this.id = id;
	}
	
	
	public String getPw() {
		return pw;
	}
	
	
	public void setPw(String pw) {
		this.pw = pw;
	}
	
	
	@Override
	public String toString() {
		return "Member [id=" + id + ", pw=" + pw + "]";
	}


//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((id == null) ? 0 : id.hashCode());
//		return result;
//	}
//

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member other = (Member) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
}
