@Grab("org.springframework.boot:spring-boot-starter-actuator:0.5.0.M5")
@Grab("org.springframework.boot:spring-boot-starter-security:0.5.0.M5")
@RestController 
class App { 
  @RequestMapping("/")
  Greeting home() {
  	new Greeting(message:'Hi!')
  }
}

class Greeting {
	String message
}