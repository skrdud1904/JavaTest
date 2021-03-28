package vo_test;

public class Member_vo {
	
	// 이거는 Default 접근 제어자임
	// 명확히 코딩하기 위해서는 private를 사용해주는데 private는 같은 Class 내에서만 사용한다.
	
	private int member_no;
	
	private String member_id;
	private String mamber_name;
	private String member_password;
	private String member_email;
	private String member_phone;
	
	
	public Member_vo(String member_id, String mamber_name, String member_password, String member_email,
			String member_phone, int member_no) {
		super();
		this.member_id = member_id;
		this.mamber_name = mamber_name;
		this.member_password = member_password;
		this.member_email = member_email;
		this.member_phone = member_phone;
		this.member_no = member_no;
	}

	

	public int getMember_no() {
		return member_no;
	}

	public void setMember_no(int member_no) {
		this.member_no = member_no;
	}

	public String getMember_id() {
		return member_id;
	}

	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}

	public String getMamber_name() {
		return mamber_name;
	}

	public void setMamber_name(String mamber_name) {
		this.mamber_name = mamber_name;
	}

	public String getMember_password() {
		return member_password;
	}

	public void setMember_password(String member_password) {
		this.member_password = member_password;
	}

	public String getMember_email() {
		return member_email;
	}

	public void setMember_email(String member_email) {
		this.member_email = member_email;
	}

	public String getMember_phone() {
		return member_phone;
	}

	public void setMember_phone(String member_phone) {
		this.member_phone = member_phone;
	}

	public Member_vo() {
		super();
	}
}
