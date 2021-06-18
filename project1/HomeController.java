@Controller
public class HomeController {
  @RequestMapping("/")
  public String homePage(){
    return "hometemplate";
  }
}
