package site.metacoding.firstapp.domain;

import java.sql.Timestamp;

import lombok.Getter;

@Getter
public class Users {
	private Integer usersId;
	private String usersName;
	private String usersPassword;
	private String usersEmail;
	private Integer productId;
	private Timestamp createdAt;
}
