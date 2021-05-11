import org.springframework.stereotype.Controller
    org.springframework.web.bind.annotation.RequestMapping

@Controller
    public class HomeController {
    @RequestMapping("/")
        public String homePage(){
        return "index";
    }
}

