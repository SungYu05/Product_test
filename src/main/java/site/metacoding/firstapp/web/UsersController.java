package site.metacoding.firstapp.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import lombok.RequiredArgsConstructor;
import site.metacoding.firstapp.service.UsersService;
import site.metacoding.firstapp.web.dto.users.UsersSaveReqDto;

@RequiredArgsConstructor
@Controller
public class UsersController {
	private final UsersService usersService;
	
	@GetMapping("/users/add")
	public String saveForm() {
		return "users/saveForm";
	}
	
	@PostMapping("/users/add")
	public String add(UsersSaveReqDto usersSaveReqDto) {
		usersService.inset(usersSaveReqDto);
		return "redirect:/";
	}
}
