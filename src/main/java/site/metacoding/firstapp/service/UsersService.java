package site.metacoding.firstapp.service;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.firstapp.domain.UsersDao;
import site.metacoding.firstapp.web.dto.users.UsersSaveReqDto;

@RequiredArgsConstructor
@Service
public class UsersService {
	private final UsersDao usersDao;
	
	// 회원가입
	public void inset(UsersSaveReqDto usersSaveReqDto) {
		usersDao.insert(usersSaveReqDto.toEntity());
	}
}
