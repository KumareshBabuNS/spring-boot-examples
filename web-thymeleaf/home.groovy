@Grab("org.springframework.boot:spring-boot-starter-actuator:0.5.0.M5")
@Grab("org.thymeleaf:thymeleaf-spring3:2.0.16")
@Controller
class HomeController {
	@RequestMapping("/")
	String home() {
		return "home";
	}
}