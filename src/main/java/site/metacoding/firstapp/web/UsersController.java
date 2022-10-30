package site.metacoding.firstapp.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import lombok.RequiredArgsConstructor;
import site.metacoding.firstapp.domain.Users;
import site.metacoding.firstapp.service.UsersService;
import site.metacoding.firstapp.web.dto.users.UsersListReqDto;
import site.metacoding.firstapp.web.dto.users.UsersSaveReqDto;

@RequiredArgsConstructor
@Controller
public class UsersController {
	private final UsersService usersService;
	
	// 회원가입
	@GetMapping("/users/add")
	public String saveForm() {
		return "users/saveForm";
	}
	
	@PostMapping("/users/add")
	public String add(UsersSaveReqDto usersSaveReqDto) {
		usersService.inset(usersSaveReqDto);
		return "redirect:/users";
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
}
