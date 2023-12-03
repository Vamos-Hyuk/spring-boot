package sesac.sesacspringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ExController {
    @GetMapping("/Ex")
    public String getEx(Model model) {
        model.addAttribute("age", 20);
        return "Ex";
    }
}


