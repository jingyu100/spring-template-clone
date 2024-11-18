package rpa0108.spring_template.Controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import rpa0108.spring_template.entity.User;
import rpa0108.spring_template.service.UserService;

import java.util.Optional;

@Controller
@RequiredArgsConstructor
public class MainController {

    private final UserService userService;

    @GetMapping("/")
    public String mainPage() {
        return "main";
    }

    @GetMapping("/register")
    public String registerPage() {
        return "register";
    }

    @GetMapping("/register/detail")
    public String registerDetailPage(User user) {
        return "register_detail";
    }

    @PostMapping("/register/complete")
    public String registerCompletePage(User user) {
        userService.save(user);
        return "register_complete";
    }
}
