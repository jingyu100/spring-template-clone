package rpa0108.spring_template.Controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import rpa0108.spring_template.service.UserService;

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
    public String registerDetailPage() {
        return "register_detail";
    }

    @GetMapping("/register/complete")
    public String registerCompletePage() {
        return "register_complete";
    }
}
