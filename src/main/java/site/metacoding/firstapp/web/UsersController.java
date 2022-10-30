package site.metacoding.firstapp.web;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import lombok.RequiredArgsConstructor;
import site.metacoding.firstapp.domain.Users;
import site.metacoding.firstapp.service.UsersService;
import site.metacoding.firstapp.web.dto.users.UsersListReqDto;
import site.metacoding.firstapp.web.dto.users.UsersLoginReqDto;
import site.metacoding.firstapp.web.dto.users.UsersJoinReqDto;
import site.metacoding.firstapp.web.dto.users.UsersUpdateReqDto;

@RequiredArgsConstructor
@Controller
public class UsersController {
	private final UsersService usersService;
	private final HttpSession session;
	
	// 회원가입
	@GetMapping("/users/join")
	public String saveForm() {
		return "users/joinForm";
	}
	
	@PostMapping("/users/join")
	public String add(UsersJoinReqDto usersSaveReqDto) {
		usersService.inset(usersSaveReqDto);
		return "redirect:/users";
	}
	
	// 로그인
	@GetMapping("/users/login")
	public String loginForm() {
		return "users/loginForm";
	}
	
	@PostMapping("/users/login")
	public String login(UsersLoginReqDto usersLoginReqDto) {
		Users principal = usersService.login(usersLoginReqDto);
		if(principal == null) {
			return "redirect:/users/login";
		}else {
			return "redirect:/users";
		}
	}
	
	// 회원 목록보기
	@GetMapping("/users")
	public String getUsers(Model model, UsersListReqDto usersListReqDto) {
		List<Users> usersList = usersService.findAll(usersListReqDto);
		model.addAttribute("usersList", usersList);
		return "users/list";
	}
	
	// 회원 상세 보기
	@GetMapping("/users/{usersId}")
	public String detail(Model model, @PathVariable Integer usersId) {
		Users usersPS = usersService.findById(usersId);
		model.addAttribute("usersPS", usersPS);
		return "users/detail";
	}
	
	// 회원 수정하기
	@GetMapping("/users/{usersId}/edit")
	public String editForm(Model model, @PathVariable Integer usersId, UsersUpdateReqDto usersUpdateReqDto) {
		Users usersPS = usersService.findById(usersId);
		model.addAttribute("edit", usersPS);
		return "users/edit";
	}
	
	@PostMapping("/users/{usersId}/edit")
	public String edit(Model model, @PathVariable Integer usersId, UsersUpdateReqDto usersUpdateReqDto) {
		Users usersPS = usersService.update(usersId, usersUpdateReqDto);
		model.addAttribute("edit", usersPS);
		return "redirect:/users";
	}
}
