package site.metacoding.firstapp.web.dto.users;

import lombok.Getter;
import lombok.Setter;
import site.metacoding.firstapp.domain.Users;

@Getter
@Setter
public class UsersListReqDto {
	private String usersName;
	private String usersPassword;
	private String usersEmail;
	
	public Users toEntity() {
		Users users = new Users(usersName, usersPassword, usersEmail);
		return users;
	}
}
