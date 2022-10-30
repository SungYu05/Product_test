package site.metacoding.firstapp.web.dto.users;

import lombok.Getter;
import lombok.Setter;
import site.metacoding.firstapp.domain.Users;

@Getter
@Setter
public class UsersUpdateReqDto {
	private String usersPassword;
	private String usersEmail;
}
