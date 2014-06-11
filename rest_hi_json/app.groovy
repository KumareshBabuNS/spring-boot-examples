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