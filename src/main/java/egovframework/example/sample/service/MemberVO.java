package egovframework.example.sample.service;

public class MemberVO {

	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserNm() {
		return userNm;
	}
	public void setUserNm(String userNm) {
		this.userNm = userNm;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRegDt() {
		return regDt;
	}
	public void setRegDt(String regDt) {
		this.regDt = regDt;
	}
	private String userId;
	private String password;
	private String userNm ;
	private String email ;
	private String regDt ;
}


//USER_ID VARCHAR(50) PRIMARY KEY,
//PASSWORD VARCHAR(100),
//USER_NM VARCHAR(100),
//EMAIL VARCHAR(100),
//REG_DT TIMESTAMP DEFAULT CURRENT_TIMESTAMP
