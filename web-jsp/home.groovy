@Grab("org.springframework.boot:spring-boot-starter-actuator:0.5.0.M5")
@Controller
class HomeController {
	@RequestMapping("/")
	String home() {
		return "home";
	}
}