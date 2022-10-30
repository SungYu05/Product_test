package site.metacoding.firstapp.domain;

import java.sql.Timestamp;

import lombok.Getter;

@Getter
public class Users {
	private Integer usersId;
	private String usersName;
	private String usersPassword;
	private String usersEmail;
	private Timestamp createdAt;
	
	public Users(String usersName, String usersPassword, String usersEmail) {
		this.usersName = usersName;
		this.usersPassword = usersPassword;
		this.usersEmail = usersEmail;
	}
	
	
}
