package site.metacoding.firstapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.firstapp.domain.Users;
import site.metacoding.firstapp.domain.UsersDao;
import site.metacoding.firstapp.web.dto.users.UsersListReqDto;
import site.metacoding.firstapp.web.dto.users.UsersLoginReqDto;
import site.metacoding.firstapp.web.dto.users.UsersJoinReqDto;
import site.metacoding.firstapp.web.dto.users.UsersUpdateReqDto;

@RequiredArgsConstructor
@Service
public class UsersService {
	private final UsersDao usersDao;
	
	// 회원가입
	public void inset(UsersJoinReqDto usersSaveReqDto) {
		usersDao.insert(usersSaveReqDto.toEntity());
	}
	
	// 로그인
	public Users login(UsersLoginReqDto usersLoginReqDto) {
		Users usersPS = usersDao.findByUsersName(usersLoginReqDto.getUsersName());
		if (usersPS == null) {
			return null;
		}else {
			
		}
		if(usersPS.getUsersPassword().equals(usersLoginReqDto.getUsersPassword())) {
			return usersPS;
		}else {
			return null;
		}
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
	
	// 회원 수정하기
	public Users update(Integer usersId, UsersUpdateReqDto usersUpdateReqDto) {
		// 영속화
		Users usersPS = usersDao.findById(usersId);
		// 객체 변경
		usersPS.update(usersUpdateReqDto);
		// 디비 변경
		usersDao.update(usersPS);
		return usersPS;
	}
}
