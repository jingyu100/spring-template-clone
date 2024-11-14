package rpa0108.spring_template.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class MainController {

    @GetMapping("")
    public String mainPage() {
        System.out.println("hi");
        return "main.html";
    }

}
