package persistence;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MemberDTO {

	private static Logger log = LoggerFactory.getLogger(MemberDTO.class);
	private String email;
	private String nickname;
	private String password;
	private int grade;
	
	public MemberDTO(){}
	public MemberDTO(String email, String nickname, String password) {
		super();
		this.email = email;
		this.nickname = nickname;
		this.password = password;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	
}
