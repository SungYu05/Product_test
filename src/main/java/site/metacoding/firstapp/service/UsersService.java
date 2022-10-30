package site.metacoding.firstapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.firstapp.domain.Users;
import site.metacoding.firstapp.domain.UsersDao;
import site.metacoding.firstapp.web.dto.users.UsersListReqDto;
import site.metacoding.firstapp.web.dto.users.UsersSaveReqDto;

@RequiredArgsConstructor
@Service
public class UsersService {
	private final UsersDao usersDao;
	
	// 회원가입
	public void inset(UsersSaveReqDto usersSaveReqDto) {
		usersDao.insert(usersSaveReqDto.toEntity());
	}
	
	// 회원 목록 보기
	public List<Users> findAll(UsersListReqDto usersListReqDto) {
		return usersDao.findAll();
	}
	
	// 회원 상세 보기
	public Users findById(Integer usersId) {
		Users usersPS = usersDao.findById(usersId);
		return usersPS;
	}
}
